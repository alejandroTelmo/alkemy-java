package com.alkemy.challenge.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "genres")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String image;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "genre_id")
    List<Movie> moviesList;



}
