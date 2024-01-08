package com.booking.movie.domain.payment;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UPI extends Payment {
    String virtualAddress;

    UPI(double amount, String paymentStatus, Date trasactionDate, String trasactionId) {
        super(amount, paymentStatus, trasactionDate, trasactionId);
    }

    @Override
    public boolean makePayment() {
        return false;
    }
}
