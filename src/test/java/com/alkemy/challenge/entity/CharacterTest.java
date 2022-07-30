package com.alkemy.challenge.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    void getId() {
        Character character=new Character("img1","toy story",1998,10.5,"Hermosa pelicula");
        character.setId(11L);
        assertEquals(11L,character.getId());
    }

    @Test
    void setId() {
        Character character=new Character("img1","toy story",1998,10.5,"Hermosa pelicula");
        character.setId(16L);
        assertEquals(16L,character.getId());
    }

    @Test
    void getImage() {
        Character character=new Character("img1","toy story",1998,10.5,"Hermosa pelicula");

        assertEquals("img1",character.getImage());
    }

    @Test
    void setImage() {
        Character character=new Character("img1","toy story",1998,10.5,"Hermosa pelicula");
            character.setImage("otra imagen");
        assertEquals("otra imagen",character.getImage());
    }

    @Test
    void getName() {
        Character character=new Character("img1","toy story",1998,10.5,"Hermosa pelicula");

        assertEquals("toy story",character.getName());
    }

    @Test
    void setName() {
        Character character=new Character("img1","toy story",1998,10.5,"Hermosa pelicula");
            character.setName("rapunzel");
        assertEquals("rapunzel",character.getName());
    }

    @Test
    void getAge() {
        Character character=new Character("img1","toy story",1998,10.5,"Hermosa pelicula");

        assertEquals(1998,character.getAge());
    }

    @Test
    void setAge() {
        Character character=new Character("img1","toy story",1998,10.5,"Hermosa pelicula");
            character.setAge(2002);
        assertEquals(2002,character.getAge());
    }

    @Test
    void getWeight() {
        Character character=new Character("img1","toy story",1998,10.5,"Hermosa pelicula");

        assertEquals(10.5,character.getWeight());
    }

    @Test
    void setWeight() {
        Character character=new Character("img1","toy story",1998,10.5,"Hermosa pelicula");
            character.setWeight(65.3);
        assertEquals(65.3,character.getWeight());
    }

    @Test
    void getHistory() {
        Character character=new Character("img1","toy story",1998,10.5,"Hermosa pelicula");

        assertEquals("Hermosa pelicula",character.getHistory());
    }

    @Test
    void setHistory() {
        Character character=new Character("img1","toy story",1998,10.5,"Hermosa pelicula");
            character.setHistory("Otra historia");
        assertEquals("Otra historia",character.getHistory());
    }


}