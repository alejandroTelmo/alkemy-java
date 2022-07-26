package com.alkemy.challenge.service;


import com.alkemy.challenge.dto.GenreDTO;

import java.util.List;
import java.util.Optional;

public interface IGenreService {
    void create(GenreDTO genreDTO);
    void delete(Long id);
    void update(GenreDTO genreDTO);
    Optional<GenreDTO> findOneById(Long id);
    List<GenreDTO> allGenres();
}
