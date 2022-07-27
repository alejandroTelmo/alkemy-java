package com.alkemy.challenge.controller;

import com.alkemy.challenge.dto.CharacterDTO;
import com.alkemy.challenge.dto.MovieDTO;
import com.alkemy.challenge.exception.ResourceNotFoundException;
import com.alkemy.challenge.service.ICharacterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    ICharacterService characterService;

    public CharacterController(ICharacterService characterService) {
        this.characterService = characterService;
    }

    @PostMapping
    CharacterDTO create(@RequestBody CharacterDTO characterDTO) throws ResourceNotFoundException {
        return characterService.create(characterDTO);
    }
    @GetMapping
    List<CharacterDTO> allCharacters(){
        return characterService.allCharacters();
    }
    @GetMapping("/{id}")
    Optional<CharacterDTO> findOneById(@PathVariable Long id){
        return characterService.findOneById(id);
    }
    @PutMapping("/{id}")
    CharacterDTO update(@RequestBody CharacterDTO characterDTO,@PathVariable Long id) throws ResourceNotFoundException {
        if (id==characterDTO.getId())
            characterService.update(characterDTO);
        return characterDTO;
    }
    @DeleteMapping("/{id}")
    ResponseEntity<HttpStatus> delete(@PathVariable Long id) throws ResourceNotFoundException {
        characterService.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
