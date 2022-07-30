package com.alkemy.challenge.controller;

import com.alkemy.challenge.dto.CharacterDTO;
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
    Optional<CharacterDTO> findOneById(@PathVariable Long id) throws ResourceNotFoundException {
        return characterService.findOneById(id);
    }
    @PutMapping("/{id}")
    CharacterDTO update(@RequestBody CharacterDTO characterDTO,@PathVariable Long id) throws ResourceNotFoundException {
        if (characterDTO.getId()==id){
            characterService.update(characterDTO);
            return characterDTO;
        }else
            throw new ResourceNotFoundException("No coincide el id de busqueda con el id del objeto.");

    }
    @DeleteMapping("/{id}")
    ResponseEntity<HttpStatus> delete(@PathVariable Long id) throws ResourceNotFoundException {
        characterService.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
    @GetMapping("/find/{name}")
    public Optional<CharacterDTO> findByName(@PathVariable("name")  String name) throws ResourceNotFoundException {
        return    characterService.findByName(name);
    }
    @GetMapping("/age/{age}")
    public Optional<CharacterDTO> findOneByAge(@PathVariable Integer age) throws ResourceNotFoundException {
        return characterService.findByAge(age);
    }
    @GetMapping("/age/{weight}")
    public Optional<CharacterDTO> findOneByWeight(@PathVariable Double weight) throws ResourceNotFoundException {
        return characterService.findByWeight(weight);
    }


}
