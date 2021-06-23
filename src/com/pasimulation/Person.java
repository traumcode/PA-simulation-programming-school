package com.pasimulation;

import java.time.LocalDate;

public abstract class Person {
    private String name;
    private LocalDate birthDate;
    private String phoneNumber;

    public Person(String name, LocalDate birthDate, String phoneNumber) {
        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

}
