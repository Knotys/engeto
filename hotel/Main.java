package com.engeto.hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("--------     Hotel Atlantis      ---------");

        ///region - HOSTÉ
        Guest adela = new Guest(
                "Adéla Malíková",
                LocalDate.of(1993, 3, 13));
        Guest jan = new Guest(
                "Jan Dvořáček",
                LocalDate.of(1995, 5, 5));
        Guest rob = new Guest(
                "Robert Knotek",
                LocalDate.of(2002, 4, 30));

        System.out.println("Hosté:");   // výpis hostů
        System.out.println(adela.getDescription());
        System.out.println(jan.getDescription());
        System.out.println(rob.getDescription());
        ///endregion

        /// region - POKOJE
        Room cislo1 = new Room(1, 1,
                true, true, 1200);
        Room cislo2 = new Room(2, 1,
                true, false , 1000);
        Room cislo3 = new Room(3, 3,
                false, true, 2400);

        System.out.println("Pokoje:");  // výpis pokojů
        System.out.println(cislo1.getDescription());
        System.out.println(cislo2.getDescription());
        System.out.println(cislo3.getDescription());
        ///endregion

        ///region - REZERVACE
        ListOfBookings listOfBookings = new ListOfBookings();
        listOfBookings.addBooking(new Booking(adela, cislo1, LocalDate.of(2021,7,24),
                LocalDate.of(2021,7,30),TypeOfVacation.Pracovní));
        listOfBookings.addBooking(new Booking(jan, cislo3, LocalDate.of(2022,10,10),
                LocalDate.of(2022,10,24),TypeOfVacation.Rekreační));
        listOfBookings.addBooking(new Booking(rob, cislo2, LocalDate.of(2022,6,23),
                LocalDate.of(2022,7,1),TypeOfVacation.Rekreační));

        System.out.println("Seznam Rezervací:");
        System.out.println("Počet: "+listOfBookings.numberOfBookings());
        listOfBookings.printAllBookings();
        ///endregion

    }
}
