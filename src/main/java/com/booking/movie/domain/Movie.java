package com.booking.movie.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class Movie {
    String movieTitle;
    String gener;
    List<Enum> language;
    Cast cast;
    Crew crew;
    Votes votes;
}
