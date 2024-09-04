package com.example.movie_api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MovieService {

    @Value("${tmdb.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate;
    private final MovieRepository movieRepository;

    // Construtor para injeção de dependência
    public MovieService(RestTemplate restTemplate, MovieRepository movieRepository) {
        this.restTemplate = restTemplate;
        this.movieRepository = movieRepository;
    }

    // Método para buscar filmes na API externa
    public String searchMovie(String query) {
        String url = "https://api.themoviedb.org/3/search/movie?api_key=" + apiKey + "&query=" + query;
        return restTemplate.getForObject(url, String.class);
    }

    // Método para salvar um filme no banco de dados
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    // Método para listar todos os filmes no banco de dados
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    // Método para encontrar um filme por Id
    public Movie findMovieById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }

    // Método para deletar um filme pelo Id
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }

    // Método para adicionar um novo filme
    public Movie addMovie(String title, String status) {
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setStatus(status);
        movie.setAddedAt(LocalDateTime.now());
        return saveMovie(movie);
    }
}

