package com.booking.movie.domain.booking;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CinemaHallSeat {
    int seatRow;
    int seatColumn;
    SeatType seatType;
}
