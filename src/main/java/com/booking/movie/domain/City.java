package com.booking.movie.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;

@Getter
@Setter
@Builder
public class City {
    String name;
    String state;
    String zipcode;
    CinemaHall cinemaHall;
}
