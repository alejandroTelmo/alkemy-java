package com.alkemy.challenge.dto;

import com.alkemy.challenge.entity.Character;
import com.alkemy.challenge.entity.Movie;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MovieDTOTest {

    @Test
    void getId() {
        Character c1=new Character("img1","pipo",8,10.5,"Nuevo");
        Character c2=new Character("img2","pupo",38,70.5,"old");
        List<Character> characterList=new ArrayList<>();
        characterList.add(c1);
        characterList.add(c2);
        MovieDTO movie=new MovieDTO("img/portada","Peliculon", LocalDate.now(),4,characterList);
        movie.setId(5L);
        assertEquals(5L,movie.getId());
    }

    @Test
    void setId() {
        Character c1=new Character("img1","pipo",8,10.5,"Nuevo");
        Character c2=new Character("img2","pupo",38,70.5,"old");
        List<Character> characterList=new ArrayList<>();
        characterList.add(c1);
        characterList.add(c2);
        MovieDTO movie=new MovieDTO("img/portada","Peliculon", LocalDate.now(),4,characterList);
        movie.setId(35L);
        assertEquals(35L,movie.getId());
    }

    @Test
    void getImage() {
        Character c1=new Character("img1","pipo",8,10.5,"Nuevo");
        Character c2=new Character("img2","pupo",38,70.5,"old");
        List<Character> characterList=new ArrayList<>();
        characterList.add(c1);
        characterList.add(c2);
        MovieDTO movie=new MovieDTO("img/portada","Peliculon", LocalDate.now(),4,characterList);
        assertEquals("img/portada",movie.getImage());
    }

    @Test
    void setImage() {
        Character c1=new Character("img1","pipo",8,10.5,"Nuevo");
        Character c2=new Character("img2","pupo",38,70.5,"old");
        List<Character> characterList=new ArrayList<>();
        characterList.add(c1);
        characterList.add(c2);
        MovieDTO movie=new MovieDTO("img/portada","Peliculon", LocalDate.now(),4,characterList);
        movie.setImage("otraimagen");
        assertEquals("otraimagen",movie.getImage());
    }

    @Test
    void getTitle() {
        Character c1=new Character("img1","pipo",8,10.5,"Nuevo");
        Character c2=new Character("img2","pupo",38,70.5,"old");
        List<Character> characterList=new ArrayList<>();
        characterList.add(c1);
        characterList.add(c2);
        MovieDTO movie=new MovieDTO("img/portada","Peliculon", LocalDate.now(),4,characterList);
        assertEquals("Peliculon",movie.getTitle());
    }

    @Test
    void setTitle() {
        Character c1=new Character("img1","pipo",8,10.5,"Nuevo");
        Character c2=new Character("img2","pupo",38,70.5,"old");
        List<Character> characterList=new ArrayList<>();
        characterList.add(c1);
        characterList.add(c2);
        MovieDTO movie=new MovieDTO("img/portada","Peliculon", LocalDate.now(),4,characterList);
        movie.setTitle("nuevo titulo");
        assertEquals("nuevo titulo",movie.getTitle());

    }

    @Test
    void getCreationDate() {
        Character c1=new Character("img1","pipo",8,10.5,"Nuevo");
        Character c2=new Character("img2","pupo",38,70.5,"old");
        List<Character> characterList=new ArrayList<>();
        characterList.add(c1);
        characterList.add(c2);
        MovieDTO movie=new MovieDTO("img/portada","Peliculon", LocalDate.now(),4,characterList);
        LocalDate dateMovie=movie.getCreationDate();
        assertEquals(dateMovie,movie.getCreationDate());
    }

    @Test
    void setCreationDate() {
        Character c1=new Character("img1","pipo",8,10.5,"Nuevo");
        Character c2=new Character("img2","pupo",38,70.5,"old");
        List<Character> characterList=new ArrayList<>();
        characterList.add(c1);
        characterList.add(c2);
        MovieDTO movie=new MovieDTO("img/portada","Peliculon", LocalDate.now(),4,characterList);
        LocalDate dateMovie=movie.getCreationDate();
        movie.setCreationDate(LocalDate.of(2000,10,16));
        assertNotEquals(dateMovie,movie.getCreationDate());
    }

    @Test
    void getRating() {
        Character c1=new Character("img1","pipo",8,10.5,"Nuevo");
        Character c2=new Character("img2","pupo",38,70.5,"old");
        List<Character> characterList=new ArrayList<>();
        characterList.add(c1);
        characterList.add(c2);
        MovieDTO movie=new MovieDTO("img/portada","Peliculon", LocalDate.now(),4,characterList);
        assertEquals(4,movie.getRating());

    }

    @Test
    void setRating() {
        Character c1=new Character("img1","pipo",8,10.5,"Nuevo");
        Character c2=new Character("img2","pupo",38,70.5,"old");
        List<Character> characterList=new ArrayList<>();
        characterList.add(c1);
        characterList.add(c2);
        MovieDTO movie=new MovieDTO("img/portada","Peliculon", LocalDate.now(),4,characterList);
        movie.setRating(2);
        assertEquals(2,movie.getRating());

    }
}