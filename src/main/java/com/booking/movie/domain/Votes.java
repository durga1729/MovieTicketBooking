package com.booking.movie.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Votes {
    String likes;
    String dislikes;
}
