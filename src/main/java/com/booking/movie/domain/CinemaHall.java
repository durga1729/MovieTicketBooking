package com.booking.movie.domain;

import com.booking.movie.util.DateUtil;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.text.ParseException;
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
