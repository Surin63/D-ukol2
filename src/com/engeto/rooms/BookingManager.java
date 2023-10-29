package com.engeto.rooms;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Booking> allBooking = new ArrayList<>();

    double averageGuests;



    public List<Booking> getAllBooking() {
        return allBooking;
    }
    public void addAllBookings(List<Booking> allBooking){this.allBooking.addAll(allBooking);}
    public Booking getBooking(int index) {
        if (index >= 0 && index < allBooking.size())
        {
            return allBooking.get(index);
        }
        return null;
    }

    public int getNumberOfBookings() {
        return allBooking.size();
    }
    public double getAvarageGuests() {
        return averageGuests;
    }
    public void setAvarageGuests(double avarageGuests) {
        this.averageGuests = avarageGuests;
    }
    public int getNumberOfGuests(){
        int count = 0;
        for (Booking booking : allBooking) {
            count += booking.getNumbersOfGuests();
        }
        return count;
    }
    public double getAveregeGuests(int numberOfGuest) {
        if (allBooking.size() > 0) {
            int totalGuests = 0;
            for(Booking booking : allBooking) {
                totalGuests += booking.getNumbersOfGuests();
            }
            double avarageGuests = (double) totalGuests / allBooking.size();
            return Math.round(avarageGuests * 100.00) / 100.00;
        }else {
            return 0.0;
        }
    }
}
