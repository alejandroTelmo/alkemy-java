package com.alkemy.challenge.service;


import com.alkemy.challenge.dto.GenreDTO;
import com.alkemy.challenge.exception.ResourceNotFoundException;



public interface IGenreService {
    void create(GenreDTO genreDTO) throws ResourceNotFoundException;

}
