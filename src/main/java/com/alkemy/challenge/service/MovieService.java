package com.alkemy.challenge.service;

import com.alkemy.challenge.dto.MovieDTO;
import com.alkemy.challenge.entity.Movie;
import com.alkemy.challenge.repository.MovieRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MovieService implements IMovieService{

    MovieRepository movieRepository;
    ObjectMapper mapper;

    public MovieService(MovieRepository movieRepository, ObjectMapper mapper) {
        this.movieRepository = movieRepository;
        this.mapper = mapper;
    }

    @Override
    public void create(MovieDTO movieDTO) {
        if (movieDTO.getId()==null)
            movieRepository.save(mapper.convertValue(movieDTO, Movie.class));

    }

    @Override
    public void delete(Long id) {
        if (movieRepository.findById(id).isPresent())
            movieRepository.deleteById(id);
    }

    @Override
    public void update(MovieDTO movieDTO) {
        if (movieDTO.getId()!=null && movieRepository.findById(movieDTO.getId()).isPresent())
            movieRepository.save(mapper.convertValue(movieDTO,Movie.class));
    }

    @Override
    public Optional<MovieDTO> findOneById(Long id) {

        return Optional.of(mapper.convertValue(movieRepository.findById(id),MovieDTO.class));
    }

    @Override
    public List<MovieDTO> allMovies() {
        List<Movie> movieList=movieRepository.findAll();
        List<MovieDTO> movieDTOList=new ArrayList<>();
        for(Movie m:movieList)
            movieDTOList.add(mapper.convertValue(m,MovieDTO.class));
        return movieDTOList;
    }
}
