package com.alkemy.challenge.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String image;
    String title;
    LocalDate creationDate;
    Integer rating;
    @ManyToMany
    @JoinTable(
            name = "movie_character",
            joinColumns = @JoinColumn(name ="movie_id" ),
            inverseJoinColumns = @JoinColumn(name ="character_id" )
            )
    List<Character> characterList;


    public Movie() {
    }

    public Movie(String image, String title, LocalDate creationDate, Integer rating, List<Character> characterList) {
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



    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", title='" + title + '\'' +
                ", creationDate=" + creationDate +
                ", rating=" + rating +
                '}';
    }
}
