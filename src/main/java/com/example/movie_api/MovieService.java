package com.example.movie_api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MovieService {


    @value("${tmdb.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate;
    private final MovieRepository movieRepository;

    public MovieService(RestTemplate restTemplate, MovieRepository movieRepository){
        this.restTemplate = restTemplate;
        this.movieRepository = movieRepository;
    }

    public TmdbService(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }

    // metodo para buscar filmes na api externa
    public String searchMovie(string query){
        String url="https://api.themoviedb.org/3/search/movie?api_key=" + apiKey + "&query=" + query;
        return restTemplate.getForObject(url,string.Class);
    }

    // metodo para salvar um filme no banco de dados
    public Movie saveMovie(Movie movie){
        return movieRepository.save(movie);
    }

    // metodo para listar todos os filmes no banco de  dados

    public List<Movie> getAllMovies(){
        return movieRepository.findAll()
    }

    // metodo para encontrar um filme por Id
    public Movie findmovieById(Long Id){
        return movieRepository.findyById(Id).orElse(null);
    }

    // metodo para deletar um filme pelo Id
    public void deleteMovie(Long Id){
        movieRepository.deleteById(id);

    }
}
