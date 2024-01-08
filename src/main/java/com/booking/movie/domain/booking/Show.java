package com.booking.movie.domain.booking;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class Show {
    Date createdOn;
    String startTime;
    String endTime;
}
