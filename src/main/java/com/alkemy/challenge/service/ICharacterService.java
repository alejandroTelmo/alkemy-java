package com.alkemy.challenge.service;

import com.alkemy.challenge.dto.CharacterDTO;

import java.util.List;
import java.util.Optional;

public interface ICharacterService {
    void create(CharacterDTO characterDTO);
    void delete(Long id);
    void update(CharacterDTO characterDTO);
    Optional<CharacterDTO> findOneById(Long id);
    List<CharacterDTO> allCharacters();
}
