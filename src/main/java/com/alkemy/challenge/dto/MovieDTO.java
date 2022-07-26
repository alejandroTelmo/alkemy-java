package com.alkemy.challenge.dto;

import java.time.LocalDate;

public class MovieDTO {
    Long id;
    String image;
    String title;
    LocalDate creationDate;

    public MovieDTO() {
    }

    public MovieDTO(Long id, String image, String title, LocalDate creationDate) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.creationDate = creationDate;
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
}
