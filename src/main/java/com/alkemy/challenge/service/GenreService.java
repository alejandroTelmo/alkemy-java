package com.alkemy.challenge.service;

import com.alkemy.challenge.dto.GenreDTO;
import com.alkemy.challenge.entity.Genre;
import com.alkemy.challenge.exception.ResourceNotFoundException;
import com.alkemy.challenge.repository.GenreRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;


@Service
public class GenreService implements IGenreService{

    GenreRepository genreRepository;
    ObjectMapper mapper;

    public GenreService(GenreRepository genreRepository, ObjectMapper mapper) {
        this.genreRepository = genreRepository;
        this.mapper = mapper;
    }

    @Override
    public void create(GenreDTO genreDTO) throws ResourceNotFoundException {
        if (genreDTO.getId()==null)
            genreRepository.save(mapper.convertValue(genreDTO, Genre.class));
        else
            throw new ResourceNotFoundException("El objeto tiene id, no debe tenerlo.");
    }


}
