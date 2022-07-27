package com.alkemy.challenge.service;

import com.alkemy.challenge.dto.CharacterDTO;
import com.alkemy.challenge.entity.Character;
import com.alkemy.challenge.exception.ResourceNotFoundException;
import com.alkemy.challenge.repository.CharacterRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CharacterService implements ICharacterService{

    final CharacterRepository characterRepository;
    final ObjectMapper mapper;

    public CharacterService(CharacterRepository characterRepository, ObjectMapper mapper) {
        this.characterRepository = characterRepository;
        this.mapper = mapper;
    }

    @Override
    public CharacterDTO create(CharacterDTO characterDTO) throws ResourceNotFoundException {
        if(characterDTO.getId()==null){
            characterRepository.save(mapper.convertValue(characterDTO,Character.class));
            return characterDTO;
        }else
            throw new ResourceNotFoundException("No se pudo crear el nuevo personaje");
    }

    @Override
    public void delete(Long id) throws ResourceNotFoundException {
        if (characterRepository.findById(id).isPresent()){
            characterRepository.deleteById(id);
        }else
            throw new ResourceNotFoundException("No se encontro el personaje con el id : "+id+" .");

    }


    @Override
    public CharacterDTO update(CharacterDTO characterDTO) throws ResourceNotFoundException {
        if (characterDTO.getId()!=null && characterRepository.findById(characterDTO.getId()).isPresent() ){
            characterRepository.save(mapper.convertValue(characterDTO,Character.class));
            return characterDTO;
        }else
            throw new ResourceNotFoundException("No tiene id o el id pasado no coincide con el id pasado dentro del objeto.");



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
        return characterDTOS;
    }
}
