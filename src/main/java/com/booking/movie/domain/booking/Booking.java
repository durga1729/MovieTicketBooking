package com.booking.movie.domain.booking;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class Booking {
    String bookingNumber;
    int numberOfSeats;
    Date createdOn;
    String bookingStatus;
    ShowSeat showSeat;

    public boolean cancel() {
        return false;
    }
}
