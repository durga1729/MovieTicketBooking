package com.booking.movie.domain.movie;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Crew {
    String director;
    String producer;
}
