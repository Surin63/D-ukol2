import com.engeto.rooms.Reservation;
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


        List<Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);

        System.out.println(roomList + "\n");


        Reservation first = new Reservation("Adela Malikova",
                1,
                LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26),
                true);
        Reservation second = new Reservation("Adela Malikova a Jana Dvorakova",
                3,
                LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14),
                false);


        List<Reservation> reservationList = new ArrayList<>();

        reservationList.add(first);
        reservationList.add(second);
        reservationList.add(new Reservation("Gabriela Novakova",
                1,
                LocalDate.of(2022, 5, 13),
                        LocalDate.of(2022, 5, 26),
                true));


        System.out.println(reservationList + "\n");

        Guest adela =
                new Guest(
                        "Adela Malikova",
                        LocalDate.of(1993, 3, 13));
        Guest jana =
                new Guest("Jana Dvorakova",
                        LocalDate.of(1995, 5, 5));


        List<Guest> guestList = new ArrayList<>();
        guestList.add(jana);
        guestList.add(adela);
        guestList.add(new Guest("Gabriela Novakova", LocalDate.of(1991, 3, 15)));
        System.out.println(guestList);

    }

}