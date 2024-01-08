package com.booking.movie.domain.movie;

import com.booking.movie.domain.person.Address;
import com.booking.movie.domain.booking.CinemaHall;
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
