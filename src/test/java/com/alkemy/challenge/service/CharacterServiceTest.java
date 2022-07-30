package com.alkemy.challenge.service;

import com.alkemy.challenge.dto.CharacterDTO;
import com.alkemy.challenge.exception.ResourceNotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CharacterServiceTest {

    @Autowired
    ICharacterService characterService;

    @Test
    void create() throws ResourceNotFoundException {
        CharacterDTO character=new CharacterDTO("img1","toy story",1998,10.5,"Hermosa pelicula");
        List<CharacterDTO> characterDTOList=characterService.allCharacters();
        Integer quantityCharacters=characterDTOList.size();

        characterService.create(character);
        Integer quantityCharactersAfter=characterService.allCharacters().size();

        assertEquals(quantityCharacters+1,quantityCharactersAfter);

    }

    @Test
    void delete() throws ResourceNotFoundException {
        CharacterDTO character=new CharacterDTO("img1","toy story 2",1998,10.5,"Hermosa pelicula");

        characterService.create(character);
        characterService.delete(characterService.findByName("toy story 2").get().getId());

        assertThrows(ResourceNotFoundException.class,()->characterService.findByName("toy story 2"));;
    }

    @Test
    void update() throws ResourceNotFoundException {
        CharacterDTO character=new CharacterDTO("img1","Unica",1998,10.5,"Hermosa pelicula");
         characterService.create(character);
        CharacterDTO dto=characterService.findByName("Unica").get();
        CharacterDTO c2=new CharacterDTO("img2","pupo",38,70.5,"old");
        Long id=characterService.findByName("Unica").get().getId();
        c2.setId(id);

        CharacterDTO updateCharacter=characterService.update(c2);

        assertEquals(c2.getId(),dto.getId());
        assertEquals("pupo",updateCharacter.getName());


    }

    @Test
    void findOneById() throws ResourceNotFoundException {
        CharacterDTO character=new CharacterDTO("img1","Nombre sollo",1998,10.5,"Hermosa pelicula");
        characterService.create(character);
        CharacterDTO dto=characterService.findByName("Nombre sollo").get();
        assertEquals(characterService.findOneById(dto.getId()).get().getName(),dto.getName());
    }

    @Test
    void allCharacters() throws ResourceNotFoundException {
        CharacterDTO character=new CharacterDTO("img1","sollo",1998,10.5,"pelicula");
        characterService.create(character);
        CharacterDTO character1=new CharacterDTO("img2","Nombre ",2008,105.5,"Hermosa ");
        characterService.create(character1);

        assertNotNull(characterService.allCharacters());

    }

    @Test
    void findByName() throws ResourceNotFoundException {
        CharacterDTO character=new CharacterDTO("img1","titan ae",1998,10.5,"Hermosa pelicula");
        characterService.create(character);

        CharacterDTO dto=characterService.findByName("titan ae").get();

        assertEquals("titan ae",dto.getName());
    }

    @Test
    void findByAge() throws ResourceNotFoundException {
        CharacterDTO character=new CharacterDTO("img1","titan ae",19,10.5,"Hermosa pelicula");
        characterService.create(character);

        assertNotNull(characterService.findByAge(19));
    }

    @Test
    void findByWeight() throws ResourceNotFoundException {
        CharacterDTO character=new CharacterDTO("img1","titan ae",19,17.8,"Hermosa pelicula");
        characterService.create(character);

        assertNotNull(characterService.findByWeight(17.8));
    }
}