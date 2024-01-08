package com.booking.movie.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@Builder
public class Movie {
    String movieTitle;
    String description;
    int durationInMins;
    String language;
    String genre;
    Date releaseDate;
    Cast cast;
    Crew crew;
    Votes votes;
    List<City> cities;
}
