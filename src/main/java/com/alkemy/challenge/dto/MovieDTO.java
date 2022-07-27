package com.alkemy.challenge.dto;

import java.time.LocalDate;

public class MovieDTO {
    Long id;
    String image;
    String title;
    LocalDate creationDate;

    Integer rating;

    public MovieDTO() {
    }

    public MovieDTO(String image, String title, LocalDate creationDate, Integer rating) {
        this.image = image;
        this.title = title;
        this.creationDate = creationDate;
        this.rating = rating;
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
}
