package com.alkemy.challenge.dto;

import com.alkemy.challenge.entity.Genre;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenreDTOTest {

    @Test
    void getId() {
        GenreDTO genre=new GenreDTO("terror","img/terror");
        genre.setId(3L);
        assertEquals(3L,genre.getId());
    }

    @Test
    void setId() {
        GenreDTO genre=new GenreDTO("terror","img/terror");
        genre.setId(36L);
        assertEquals(36L,genre.getId());
    }

    @Test
    void getName() {
        GenreDTO genre=new GenreDTO("terror","img/terror");

        assertEquals("terror",genre.getName());
    }

    @Test
    void setName() {
        GenreDTO genre=new GenreDTO("terror","img/terror");
        genre.setName("comedia");
        assertEquals("comedia",genre.getName());
    }

    @Test
    void getImage() {
        GenreDTO genre=new GenreDTO("terror","img/terror");

        assertEquals("img/terror",genre.getImage());
    }

    @Test
    void setImage() {
        GenreDTO genre=new GenreDTO("terror","img/terror");
        genre.setImage("img/nueva");
        assertEquals("img/nueva",genre.getImage());
    }
}