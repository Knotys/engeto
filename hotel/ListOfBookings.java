package com.engeto.hotel;

import java.util.ArrayList;
import java.util.List;

public class ListOfBookings {
    List<Booking> listOfBookings = new ArrayList<>();

    public void addBooking(Booking newBooking) {
        listOfBookings.add(newBooking);
    }

    public int numberOfBookings() {
        return listOfBookings.size();
    }

    public void printAllBookings() {
        for (Booking booking : listOfBookings)
        {
            System.out.println("    "+"Rezervace na jméno: "+booking.guest.getDescription()+
                    "; Pokoj: "+booking.room.getDescription()+"; Datum příjezdu: "+booking.getDateOfArrival()+
                    "; Datum odjezdu: "+booking.getDateOfDeparture()+
                    "; "+booking.typeOfVacation+" pobyt");
        }
    }
}
