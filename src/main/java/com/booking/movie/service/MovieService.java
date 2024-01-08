package com.booking.movie.service;

import com.booking.movie.domain.booking.*;
import com.booking.movie.domain.movie.Cast;
import com.booking.movie.domain.movie.Crew;
import com.booking.movie.domain.movie.Movie;
import com.booking.movie.domain.movie.Votes;
import com.booking.movie.domain.person.Address;
import com.booking.movie.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class MovieService {

    List<Movie> moviesList;

    @Autowired
    DateUtil dateUtil;

    public List<Movie> getMoviesByCity(String cityName) {
        moviesList = buildMovie();
        moviesList = moviesList.stream()
                .filter(movie -> movie.getCities().stream()
                        .anyMatch(city -> city.getName().equalsIgnoreCase(cityName))).collect(Collectors.toList());
        return moviesList;
    }

    public List<Movie> getMoviesByGener(String genre) {
        moviesList = buildMovie();
        moviesList = moviesList.stream().filter(m -> m.getGenre().equalsIgnoreCase(genre)).collect(Collectors.toList());
        return moviesList;
    }

    public List<Movie> getMoviesByLanguage(String language) {
        moviesList = buildMovie();
        moviesList = moviesList.stream().filter(m -> m.getLanguage().equalsIgnoreCase(language)).collect(Collectors.toList());
        return moviesList;
    }

    private List<Movie> buildMovie() {

        List<Movie> movieList = new ArrayList<>();
        try {
            List<City> hydCity = new ArrayList<>();
            List<City> mumCity = new ArrayList<>();
            List<Show> showList = showList();
            Cast cast = Cast.builder().actor("ranabir").actress("rashmika").build();
            Crew crew = Crew.builder().director("sandeep").producer("bhusan").build();
            Votes votes = Votes.builder().likes("10k").dislikes("2k").build();


            Movie movie = Movie.builder().movieTitle("animal").genre("action")
                    .description("father and son relation")
                    .cast(cast).crew(crew)
                    .releaseDate(dateUtil.getDate("25/12/2023")).language("hindi").durationInMins(120)
                    .votes(votes).build();

            Address address = Address.builder().state("tn").streetName("kphb").build();
            CinemaHallSeat cinemaHallSeat = CinemaHallSeat.builder().seatRow(100).seatColumn(20).seatType(SeatType.PREMIUM).build();
            CinemaHall cinemaHall = CinemaHall.builder().name("Arjun").totalSeats(200).cinemaHallSeat(cinemaHallSeat).showList(showList).address(address).build();
            City city = City.builder().state("tn").name("hyd").zipcode("500072").cinemaHall(cinemaHall).build();


            Address address1 = Address.builder().state("tn").streetName("miyapur").build();
            CinemaHallSeat cinemaHallSeat1 = CinemaHallSeat.builder().seatRow(100).seatColumn(30).seatType(SeatType.REGULAR).build();
            CinemaHall cinemaHall1 = CinemaHall.builder().name("Miraj").totalSeats(300).cinemaHallSeat(cinemaHallSeat1).showList(showList).address(address1).build();
            City city1 = City.builder().state("tn").name("hyd").zipcode("500072").cinemaHall(cinemaHall1).build();

            hydCity.add(city);
            hydCity.add(city1);
            movie.setCities(hydCity);

            Cast cast1 = Cast.builder().actor("shahrukh").actress("tapsi").build();
            Crew crew1 = Crew.builder().director("rajkumar").producer("gowri").build();
            Votes votes1 = Votes.builder().likes("11k").dislikes("1k").build();


            Movie movie1 = Movie.builder().movieTitle("dunki").genre("comedy")
                    .description("friendswants to travel london")
                    .cast(cast1).crew(crew1)
                    .releaseDate(dateUtil.getDate("15/10/2023")).language("hindi").durationInMins(120)
                    .votes(votes).build();

            Address address11 = Address.builder().state("mh").streetName("anderi").build();
            CinemaHallSeat cinemaHallSeat11 = CinemaHallSeat.builder().seatRow(100).seatColumn(20).seatType(SeatType.PREMIUM).build();
            CinemaHall cinemaHall11 = CinemaHall.builder().name("pvr").totalSeats(200).cinemaHallSeat(cinemaHallSeat).showList(showList).address(address11).build();

            City city11 = City.builder().state("mh").name("mumbai").zipcode("500072").cinemaHall(cinemaHall11).build();

            Address address12 = Address.builder().state("mh").streetName("bagh").build();
            CinemaHallSeat cinemaHallSeat12 = CinemaHallSeat.builder().seatRow(100).seatColumn(30).seatType(SeatType.REGULAR).build();
            CinemaHall cinemaHall12 = CinemaHall.builder().name("inox").totalSeats(300).cinemaHallSeat(cinemaHallSeat12).showList(showList).address(address12).build();
            City city12 = City.builder().state("mh").name("mumbai").zipcode("500072").cinemaHall(cinemaHall12).build();

            mumCity.add(city11);
            mumCity.add(city12);
            movie1.setCities(mumCity);

            movieList.add(movie);
            movieList.add(movie1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return movieList;
    }

    private List<Show> showList() throws ParseException {
        List<Show> showList = new ArrayList<>();
        Show show = Show.builder().createdOn(DateUtil.getDate("11/12/2023")).startTime("11:30").endTime("14:00").build();
        Show show1 = Show.builder().createdOn(DateUtil.getDate("11/12/2023")).startTime("14:30").endTime("17:00").build();
        Show show2 = Show.builder().createdOn(DateUtil.getDate("11/12/2023")).startTime("18:30").endTime("21:00").build();
        Show show3 = Show.builder().createdOn(DateUtil.getDate("11/12/2023")).startTime("21:30").endTime("23:30").build();
        showList.add(show);
        showList.add(show1);
        showList.add(show2);
        showList.add(show3);
        return showList;
    }
}

