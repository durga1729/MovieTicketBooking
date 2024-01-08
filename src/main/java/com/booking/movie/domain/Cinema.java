package com.booking.movie.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cinema {
    String name;
    int totalCinemaHalls;
    Address address;
    CinemaHall cinemaHall;
}
