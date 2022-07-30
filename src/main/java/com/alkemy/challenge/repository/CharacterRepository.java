package com.alkemy.challenge.repository;

import com.alkemy.challenge.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface CharacterRepository extends JpaRepository<Character,Long> {

    @Query("select c from Character c where c.name LIKE :name%")
    Optional<Character> findCharacterByName(String name);

    @Query("select c from Character c where c.age=:age")
    Optional<Character> findCharacterByAge(Integer age);

    @Query("select c from Character c where c.weight=:weight")
    Optional<Character> findCharacterByWeight(Double weight);


}
