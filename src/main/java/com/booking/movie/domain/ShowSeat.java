package com.booking.movie.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeat {
    int seatNumber;
    boolean isReserved;
    double price;
}
