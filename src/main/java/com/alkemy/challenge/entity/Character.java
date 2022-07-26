package com.alkemy.challenge.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "characters")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String image;
    String name;
    Integer age;
    Double weight;
    String history;
    @ManyToMany
    @JoinTable(name = "character_movie",
    joinColumns = @JoinColumn(name = "character_id"),
    inverseJoinColumns = @JoinColumn(name = "movie_id"))
    List<Movie> moviesList;

}
