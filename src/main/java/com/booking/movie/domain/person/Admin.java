package com.booking.movie.domain.person;

public class Admin extends  Person{
    Admin(String name, Address address, String phone, String email) {
        super(name, address, phone, email);
    }

    public boolean addMovie() {
        return true;
    }

    public boolean removeMovie() {
        return true;
    }

    public boolean addShow() {
        return true;
    }
}
