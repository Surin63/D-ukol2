package com.engeto.rooms;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Guest guest, guest2;
    private List<Guest> otherGuest = new ArrayList<>();
    private Room room;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private String typeOfVacation ;



    public Booking(Guest guest, Room room, LocalDate checkIn, LocalDate checkOut, String typeOfVacation) {
        this.guest = guest;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.typeOfVacation = typeOfVacation;
    }

    public Booking(Guest guest, Guest guest2, Room room, LocalDate checkIn, LocalDate checkOut, String typeOfVacation) {
        this.guest = guest;
        this.guest2 = guest2;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.typeOfVacation = typeOfVacation;
    }



    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Guest getGuest2() {
        return guest2;
    }

    public void setGuest2(Guest guest2) {
        this.guest2 = guest2;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public String getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(String typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }

    @Override
    public String toString() {
        return "\n" + "Reservation: " + "\n" +
                    guest + guest2 +
                    room +
                    " Check In = " + checkIn +
                    " Check Out = " + checkOut +
                    " Work trip = " + typeOfVacation;
    }
}







