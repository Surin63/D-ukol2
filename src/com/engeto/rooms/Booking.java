package com.engeto.rooms;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    public static int nextIndex = 1;
    private int index = nextIndex++;
    private List<Booking> bookingList = new ArrayList<>();
    private Booking booking;
    private List<Guest> guestList = new ArrayList<>();
    private Guest guest;
    private List<Guest> otherGuests = new ArrayList<>();
    private Room room;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private boolean isWorkingVacation;
    private int numbersOfGuests;



    public Booking(Guest guest, Room room, LocalDate checkIn, LocalDate checkOut, boolean isWorkingVacation) {
        this.guest = guest;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.isWorkingVacation = isWorkingVacation;

    }
    public Booking(Guest guest, Room room, LocalDate checkIn, LocalDate checkOut, boolean isWorkingVacation, List<Guest> otherGuests) {
        this.guest = guest;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.isWorkingVacation = isWorkingVacation;
        this.otherGuests = otherGuests;

    }
    public void add(Booking newBooking) {
        bookingList.add(newBooking);
    }
    public int getIndex() {
        return index;
    }
    public Booking getBookings(){
        return booking;
    }
    public void addOtherGuest(Guest newOtherGuest) {
        otherGuests.add(newOtherGuest);
    }
    public void addGuest (Guest newGuestList) {guestList.add(newGuestList);}
    public void removeGuest(Guest guest) {
        otherGuests.remove(guest);
    }

    public List<Guest> getOtherGuests() {
        return new ArrayList<Guest>(otherGuests);
    }

    public int getNumbersOfGuests() {
        return numbersOfGuests;
    }

    public void setNumbersOfGuests(int numbersOfGuests) {
        this.numbersOfGuests = numbersOfGuests;
    }




    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
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

    public boolean getWorkingVacation() {
        return isWorkingVacation;
    }

    public void setWorkingVacation(boolean workingVacation) {
        this.isWorkingVacation = workingVacation;
    }

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "\n" + "Booking" +index +": "+
                    guest + otherGuests +
                    room +
                    " Check In = " + checkIn +
                    " Check Out = " + checkOut +
                    " Type of Vacation = " + isWorkingVacation;
    }
}







