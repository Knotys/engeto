package com.engeto.hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Guest {
    String name;
    LocalDate birthdate;

    public Guest(String name, LocalDate birthdate)
    {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getDescription() {
        return getName()+" "+getBirthdate();
    }   // výpis jména a narození hosta

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
