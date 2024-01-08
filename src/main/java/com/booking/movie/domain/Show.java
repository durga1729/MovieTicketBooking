package com.booking.movie.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class Show {
    Date createdOn;
    Date startTime;
    Date endTime;
}
