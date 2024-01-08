package com.booking.movie.domain.person;

import com.booking.movie.domain.booking.Booking;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Customer extends Person {
    Customer(String name, Address address, String phone, String email) {
        super(name, address, phone, email);
    }

    public boolean makeBooking() {
        return true;
    }

    public List<Booking> booleanGetAllBookings() {
        List<Booking> bookingList = new ArrayList<>();
        return bookingList;
    }
}
