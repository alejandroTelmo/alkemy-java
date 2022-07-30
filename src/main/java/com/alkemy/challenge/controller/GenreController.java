package com.alkemy.challenge.controller;

import com.alkemy.challenge.dto.GenreDTO;
import com.alkemy.challenge.exception.ResourceNotFoundException;
import com.alkemy.challenge.service.IGenreService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/genres")
public class GenreController {

    private final static Logger logger=Logger.getLogger(GenreController.class);
    private IGenreService genreService;

    public GenreController(IGenreService genreService) {
        this.genreService = genreService;
    }

    @PostMapping
    GenreDTO create(@RequestBody GenreDTO genreDTO) throws ResourceNotFoundException {
        genreService.create(genreDTO);
        return genreDTO;
    }
}
