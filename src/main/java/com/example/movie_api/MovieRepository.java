package com.example.movie_api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface MovieRepository extends JpaRepository <Movie,Long> {
}
