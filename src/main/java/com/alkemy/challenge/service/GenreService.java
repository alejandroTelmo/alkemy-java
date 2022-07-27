package com.alkemy.challenge.service;

import com.alkemy.challenge.dto.GenreDTO;
import com.alkemy.challenge.entity.Genre;
import com.alkemy.challenge.repository.GenreRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class GenreService implements IGenreService{

    GenreRepository genreRepository;
    ObjectMapper mapper;

    public GenreService(GenreRepository genreRepository, ObjectMapper mapper) {
        this.genreRepository = genreRepository;
        this.mapper = mapper;
    }

    @Override
    public void create(GenreDTO genreDTO) {
        if (genreDTO.getId()==null)
            genreRepository.save(mapper.convertValue(genreDTO, Genre.class));
    }


}
