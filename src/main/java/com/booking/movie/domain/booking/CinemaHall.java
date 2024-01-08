package com.booking.movie.domain.booking;

import com.booking.movie.domain.person.Address;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class CinemaHall {
    String name;
    int totalSeats;
    CinemaHallSeat cinemaHallSeat;
    List<Show> showList;
    Address address;

}
