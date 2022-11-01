package com.engeto.hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {

    LocalDate dateOfArrival;
    LocalDate dateOfDeparture;
    TypeOfVacation typeOfVacation;

    public Room room;
    public Guest guest;
    private List<Guest> otherGuests;

//    List<Room> booking = new ArrayList<>();

    public Booking(Guest guest, Room room, LocalDate dateOfArrival,LocalDate dateOfDeparture ,TypeOfVacation type) {
        this.guest = guest;
        this.room = room;
        this.dateOfArrival = dateOfArrival;
        this.dateOfDeparture = dateOfDeparture;
        this.typeOfVacation = type;
    }

//    public String getDescription() {
//        return "    "+room+"Datum příjezdu: "+getDateOfArrival()+"; Datum odjezdu: "+getDateOfDeparture()+
//                "; : "+typeOfVacation;
//    }

//    public void addRoom(Room room)
//    {
//        booking.add(room);
//    }
//
//    public List<Room> getRooms() {
//        // Vrátíme kopii seznamu.
//        return new ArrayList<>(booking);
//    }

    public LocalDate getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(LocalDate dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public LocalDate getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(LocalDate dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }
}
