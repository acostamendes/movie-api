package com.example.movie_api;

import org.springframework.data.jpa.repository.JpaRepository;

    public interface MovieRepository extends JpaRepository <Movie,Long> {
}
