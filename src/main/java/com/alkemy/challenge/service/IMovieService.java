package com.alkemy.challenge.service;

import com.alkemy.challenge.dto.MovieDTO;
import com.alkemy.challenge.exception.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

public interface IMovieService {
    void create(MovieDTO movieDTO) throws ResourceNotFoundException;
    void delete(Long id);
    void update(MovieDTO movieDTO);
    Optional<MovieDTO> findOneById(Long id);
    List<MovieDTO> allMovies();
}
