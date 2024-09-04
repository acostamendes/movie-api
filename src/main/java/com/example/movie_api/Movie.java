package com.example.movie_api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Long movie_Id;
    private String title;
    private LocalDateTime AddedAt;
    private String status; //"já vi" or "Quero ver"

    // Getters e Setters
    public Long getId(){
        return  Id;
    }

    public void setId(Long id){
        this.Id = id;
    }
    // public - acessado a partir de qualquer lugar do código
    // void - metodo que retornar nenhum valor

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus (String Status){
        this.status = status;
    }

    public LocalDateTime getAddedAt(){
        return AddedAt;
    }

    public void setAddedAt(LocalDateTime addedAt){
        this.AddedAt = addedAt;
    }

}
