package com.example.movie_api;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {

    @value("${tmdb.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate;

    public TmdbService(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }

    public String searchMovie(string query){
        String url="https://api.themoviedb.org/3/search/movie?api_key=" + apiKey + "&query=" + query;
        return restTemplate.getForObject(url,string.Class);
    }

    private final
}
