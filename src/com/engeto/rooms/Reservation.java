package com.engeto.rooms;

import java.time.LocalDate;

public class Reservation {
    private String Name;
    private int RoomNumber;
    private LocalDate CheckIn;
    private LocalDate CheckOut;
    private boolean Pracovni ;

    public Reservation(String name, int roomNumber, LocalDate checkIn, LocalDate checkOut, boolean pracovni) {
        Name = name;
        RoomNumber = roomNumber;
        CheckIn = checkIn;
        CheckOut = checkOut;
        Pracovni = pracovni;
    }

    @Override
    public String toString() {
        return "\n" + "Reservation: " + "\n" +
                "Name = " + Name +
                " Room Number = " + RoomNumber +
                " Check In = " + CheckIn +
                " Check Out = " + CheckOut +
                " Work trip = " + Pracovni;
    }
}







