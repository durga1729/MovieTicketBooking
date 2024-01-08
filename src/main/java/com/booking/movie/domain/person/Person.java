package com.booking.movie.domain.person;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Person {
    String name;
    Address address;
    String phone;
    String email;
}
