package com.alkemy.challenge.dto;

import com.alkemy.challenge.entity.Character;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterDTOTest {

    @Test
    void getId() {
        CharacterDTO character=new CharacterDTO("img1","toy story",1998,10.5,"Hermosa pelicula");
        character.setId(11L);
        assertEquals(11L,character.getId());
    }

    @Test
    void setId() {
        CharacterDTO character=new CharacterDTO("img1","toy story",1998,10.5,"Hermosa pelicula");
        character.setId(15L);
        assertEquals(15L,character.getId());
    }

    @Test
    void getImage() {
        CharacterDTO character=new CharacterDTO("img1","toy story",1998,10.5,"Hermosa pelicula");

        assertEquals("img1",character.getImage());

    }

    @Test
    void setImage() {
        CharacterDTO character=new CharacterDTO("img1","toy story",1998,10.5,"Hermosa pelicula");
            character.setImage("otra");
        assertEquals("otra",character.getImage());
    }

    @Test
    void getName() {
        CharacterDTO character=new CharacterDTO("img1","toy story",1998,10.5,"Hermosa pelicula");

        assertEquals("toy story",character.getName());
    }

    @Test
    void setName() {
        CharacterDTO character=new CharacterDTO("img1","toy story",1998,10.5,"Hermosa pelicula");
        character.setName("rapunzel");
        assertEquals("rapunzel",character.getName());
    }

    @Test
    void getAge() {
        CharacterDTO character=new CharacterDTO("img1","toy story",1998,10.5,"Hermosa pelicula");

        assertEquals(1998,character.getAge());
    }

    @Test
    void setAge() {
        CharacterDTO character=new CharacterDTO("img1","toy story",1998,10.5,"Hermosa pelicula");
        character.setAge(2002);
        assertEquals(2002,character.getAge());
    }

    @Test
    void getWeight() {
        CharacterDTO character=new CharacterDTO("img1","toy story",1998,10.5,"Hermosa pelicula");

        assertEquals(10.5,character.getWeight());
    }

    @Test
    void setWeight() {
        CharacterDTO character=new CharacterDTO("img1","toy story",1998,10.5,"Hermosa pelicula");
        character.setWeight(65.3);
        assertEquals(65.3,character.getWeight());
    }

    @Test
    void getHistory() {
        CharacterDTO character=new CharacterDTO("img1","toy story",1998,10.5,"Hermosa pelicula");

        assertEquals("Hermosa pelicula",character.getHistory());
    }

    @Test
    void setHistory() {
        CharacterDTO character=new CharacterDTO("img1","toy story",1998,10.5,"Hermosa pelicula");
        character.setHistory("Otra historia");
        assertEquals("Otra historia",character.getHistory());
    }
}