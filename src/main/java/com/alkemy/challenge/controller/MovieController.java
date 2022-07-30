package com.alkemy.challenge.controller;

import com.alkemy.challenge.dto.MovieDTO;
import com.alkemy.challenge.exception.ResourceNotFoundException;
import com.alkemy.challenge.service.IMovieService;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final static Logger logger=Logger.getLogger(MovieController.class);

    IMovieService movieService;

    public MovieController(IMovieService movieService) {
        this.movieService = movieService;
    }
    @PostMapping
    MovieDTO create(@RequestBody MovieDTO movieDTO) throws ResourceNotFoundException {
        movieService.create(movieDTO);
        return movieDTO;
    }
    @GetMapping("/{id}")
    Optional<MovieDTO> findOneById(@PathVariable Long id){
        return movieService.findOneById(id);
    }
    @GetMapping
    List<MovieDTO> allMovies(){
        return movieService.allMovies();
    }
    @PutMapping("/{id}")
    MovieDTO update(@RequestBody MovieDTO movieDTO,@PathVariable Long id) throws ResourceNotFoundException {
        if (id==movieDTO.getId()){
            movieService.create(movieDTO);
            return movieDTO;
        }else
            throw new  ResourceNotFoundException("El id pasado por parametro no coincide con el id del objeto.");

    }
    @DeleteMapping("/{id}")
    ResponseEntity<HttpStatus> delete(@PathVariable Long id){
        movieService.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
