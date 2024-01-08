package com.booking.movie.service;

import com.booking.movie.domain.person.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public  String registerAccount(Person person) {
        return "Suucessfully Registerd";
    }

    public  String updateAccount(Person person) {
        return "Suucessfully Updated";
    }
}
