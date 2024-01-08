package com.booking.movie.domain.payment;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Getter
@Setter
@Builder
public abstract class Payment {
    double amount;
    String paymentStatus;
    Date trasactionDate;
    String trasactionId;

    public abstract boolean makePayment();
}
