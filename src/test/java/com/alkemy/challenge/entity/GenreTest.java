package com.alkemy.challenge.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenreTest {

    @Test
    void getId() {
        Genre genre=new Genre("terror","img/terror");
        genre.setId(3L);
        assertEquals(3L,genre.getId());
    }

    @Test
    void setId() {
        Genre genre=new Genre("terror","img/terror");
        genre.setId(36L);
        assertEquals(36L,genre.getId());
    }

    @Test
    void getName() {
        Genre genre=new Genre("terror","img/terror");

        assertEquals("terror",genre.getName());
    }

    @Test
    void setName() {
        Genre genre=new Genre("terror","img/terror");
            genre.setName("comedia");
        assertEquals("comedia",genre.getName());
    }

    @Test
    void getImage() {
        Genre genre=new Genre("terror","img/terror");

        assertEquals("img/terror",genre.getImage());
    }

    @Test
    void setImage() {
        Genre genre=new Genre("terror","img/terror");
            genre.setImage("img/nueva");
        assertEquals("img/nueva",genre.getImage());
    }


}