package com.alkemy.challenge.service;

import com.alkemy.challenge.dto.CharacterDTO;
import com.alkemy.challenge.dto.MovieDTO;
import com.alkemy.challenge.exception.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

public interface ICharacterService {
    CharacterDTO create(CharacterDTO characterDTO) throws ResourceNotFoundException;
    void delete(Long id) throws ResourceNotFoundException;
    CharacterDTO update(CharacterDTO characterDTO) throws ResourceNotFoundException;
    Optional<CharacterDTO> findOneById(Long id) throws ResourceNotFoundException;
    List<CharacterDTO> allCharacters();
    Optional<CharacterDTO> findByName(String name) throws ResourceNotFoundException;
    Optional<CharacterDTO> findByAge(Integer age) throws ResourceNotFoundException;
    Optional<CharacterDTO> findByWeight(Double age) throws ResourceNotFoundException;

}
