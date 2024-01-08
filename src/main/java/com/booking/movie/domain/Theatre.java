package com.booking.movie.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Theatre {
    int theatreId;
    String theatreName;
    Address address;
    Movie movies;
}
