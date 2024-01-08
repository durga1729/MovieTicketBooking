package com.booking.movie.service;

import com.booking.movie.domain.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public  String verifyLogin(Account account) {
        return  "Successfully Login";
    }
}
