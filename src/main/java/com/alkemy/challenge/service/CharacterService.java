package com.alkemy.challenge.service;

import com.alkemy.challenge.dto.CharacterDTO;
import com.alkemy.challenge.entity.Character;
import com.alkemy.challenge.repository.CharacterRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CharacterService implements ICharacterService{

    final CharacterRepository characterRepository;
    final ObjectMapper mapper;

    public CharacterService(CharacterRepository characterRepository, ObjectMapper mapper) {
        this.characterRepository = characterRepository;
        this.mapper = mapper;
    }

    @Override
    public void create(CharacterDTO characterDTO) {
        if(characterDTO.getId()==null)
           characterRepository.save(mapper.convertValue(characterDTO,Character.class));
    }

    @Override
    public void delete(Long id) {
        if (characterRepository.findById(id).isPresent())
            characterRepository.deleteById(id);
    }


    @Override
    public void update(CharacterDTO characterDTO) {
        if (characterDTO.getId()!=null && characterRepository.findById(characterDTO.getId()).isPresent() )
            characterRepository.save(mapper.convertValue(characterDTO,Character.class));

    }

    @Override
    public Optional<CharacterDTO> findOneById(Long id) {
        return Optional.of(mapper.convertValue(characterRepository.findById(id),CharacterDTO.class));
    }

    @Override
    public List<CharacterDTO> allCharacters() {
        List<Character> characters=characterRepository.findAll();
        List<CharacterDTO> characterDTOS=new ArrayList<>();
        for (Character c:characters){
            characterDTOS.add(mapper.convertValue(c,CharacterDTO.class));
        }
        return null;
    }
}
