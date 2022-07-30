package com.alkemy.challenge.dto;

import com.alkemy.challenge.entity.Character;


import java.time.LocalDate;
import java.util.List;

public class MovieDTO {
    Long id;
    String image;
    String title;
    LocalDate creationDate;

    Integer rating;


    List<Character> characterList;

    public MovieDTO() {
    }

    public MovieDTO(String image, String title, LocalDate creationDate, Integer rating, List<Character> characterList) {
        this.image = image;
        this.title = title;
        this.creationDate = creationDate;
        this.rating = rating;
        this.characterList = characterList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public List<Character> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(List<Character> characterList) {
        this.characterList = characterList;
    }


}
