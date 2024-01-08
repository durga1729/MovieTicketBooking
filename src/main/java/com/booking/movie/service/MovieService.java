package com.booking.movie.service;

import com.booking.movie.domain.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class MovieService {

    List<Movie> moviesList;


    public List<Movie> getMoviesByCity(String cityName) {
        Map<String, List<Theatre>> listOfTheatres = new HashMap<>();
        List<Theatre> theatreList = listOfTheatres.get(cityName);
        List<Movie> movieList = theatreList.stream().map(Theatre::getMovies).collect(Collectors.toList());
        return movieList;
    }

    public List<Movie> getMoviesByGener() {
        moviesList = new ArrayList<>();
        return moviesList;
    }

    public List<Movie> getMoviesByLanguage() {
        moviesList = new ArrayList<>();
        return moviesList;
    }

    private List<Theatre> buildMovie() {

        List<Theatre> theatreList = new ArrayList<>();
        List<Enum> laguageList = new ArrayList<>();
        laguageList.add(Language.TELUGU);
        Movie movie = new Movie();
        Votes votes = Votes.builder().likes("10k").dislikes("8k").build();
        Cast cast = Cast.builder().actor("chiru").actress("kajal").build();
        Crew crew = Crew.builder().director("vinayak").producer("prasad").build();
        movie.setCast(cast);
        movie.setCrew(crew);
        movie.setVotes(votes);
        movie.setLanguage(laguageList);
        movie.setMovieTitle("khaidi");
        movie.setGener("crime");


        Movie movie1 = new Movie();
        laguageList.add(Language.TELUGU);
        laguageList.add(Language.HINDI);
        laguageList.add(Language.ENGLISH);
        Votes votes1 = Votes.builder().likes("100k").dislikes("18k").build();
        Cast cast1 = Cast.builder().actor("ranabeer").actress("rashmika").build();
        Crew crew1 = Crew.builder().director("sandeep").producer("bhusan").build();
        movie1.setCast(cast1);
        movie1.setCrew(crew1);
        movie1.setVotes(votes1);
        movie1.setLanguage(laguageList);
        movie1.setMovieTitle("animal");
        movie1.setGener("action");

        Address address = Address.builder().streetName("kpbh").landMark("ysr statue").area("gopal nagar").city("hyderabad")
                .state("telangana").country("in").pinCode(500082).build();
        Theatre theatre = Theatre.builder().theatreName("pvr").theatreId(123).movies(movie).address(address).build();

        Address address1 = Address.builder().streetName("somajiguda").landMark("main road").area("tank bund").city("hyderabad")
                .state("telangana").country("in").pinCode(500083).build();
        Theatre theatre1 = Theatre.builder().theatreName("imax").theatreId(456).movies(movie1).address(address1).build();

        theatreList.add(theatre);
        theatreList.add(theatre1);

        return theatreList;
    }
}
