package com.booking.movie.domain.person;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Address {
    String streetName;
    String area;
    String landMark;
    String city;
    String state;
    String country;
    int pinCode;
}
