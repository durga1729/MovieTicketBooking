package com.booking.movie.controller;

import com.booking.movie.domain.Account;
import com.booking.movie.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("/login")
    public ResponseEntity<String> loginToAccount(@RequestBody Account account) {
        String response = null;
         try {
              response = accountService.verifyLogin(account);
         } catch (Exception e) {
             e.printStackTrace();
         }
        return ResponseEntity.ok(response);
    }
}
