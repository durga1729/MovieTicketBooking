package com.booking.movie.domain.booking;

import com.booking.movie.domain.booking.CinemaHall;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class City {
    String name;
    String state;
    String zipcode;
    CinemaHall cinemaHall;
}
