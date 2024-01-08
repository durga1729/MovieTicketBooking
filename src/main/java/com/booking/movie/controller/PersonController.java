package com.booking.movie.controller;

import com.booking.movie.domain.Person;
import com.booking.movie.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("/registerAccount")
    public ResponseEntity<String> registerAccount(@RequestBody Person person) {
        String registerService = personService.registerAccount(person);
        return ResponseEntity.ok(registerService);
    }

    @PutMapping("/updateAccount")
    public ResponseEntity<String> updateAccount(@RequestBody Person person) {
        String updateAccount = personService.updateAccount(person);
        return ResponseEntity.ok(updateAccount);
    }
}
