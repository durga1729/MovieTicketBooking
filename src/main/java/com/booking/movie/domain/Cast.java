package com.booking.movie.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Cast {
    String actor;
    String actress;
}
