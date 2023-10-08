import com.engeto.rooms.Booking;
import com.engeto.rooms.Room;
import com.engeto.rooms.Guest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args){
        Room room1 = new Room(1,1, true, true, 1000);
        Room room2 = new Room(2,1, true, true, 1000);
        Room room3 = new Room(3, 3, true, false, 2400);


        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);



        Guest guest1 =
                new Guest(
                        "Adela", "Malikova",
                        LocalDate.of(1993, 3, 13));
        Guest guest2 =
                new Guest("Jana", "Dvorakova",
                        LocalDate.of(1995, 5, 5));


        List<Guest> guestList = new ArrayList<>();
        guestList.add(guest1);
        guestList.add(guest2);

        System.out.println(guest1);
        System.out.println(guest2);


        Booking first = new Booking(guest1, room1,
                LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26),
                "working");
        Booking second = new Booking(guest1, guest2,
                room3,
                LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14),
                "recreational");



        List<Booking> bookingList = new ArrayList<>();

        bookingList.add(first);
        bookingList.add(second);


        System.out.println(bookingList);

        }


    }


