import com.engeto.rooms.Booking;
import com.engeto.rooms.BookingManager;
import com.engeto.rooms.Room;
import com.engeto.rooms.Guest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Booking> bookingList = new ArrayList<>();

        // 1,Vytvoreni hostu s jejich vypisem na obrazovku
        Guest guest1 =
                new Guest(
                        "Adela", "Malikova",
                        LocalDate.of(1993, 3, 13));
        Guest guest2 =
                new Guest("Jana", "Dvorakova",
                        LocalDate.of(1995, 5, 5));
        Guest guest3 =
                new Guest("Karel", "Dvorak",
                        LocalDate.of(1990, 5, 15));
        Guest guest4 =
                new Guest("Karel", "Dvorak",
                        LocalDate.of(1979, 1, 3));
        Guest guest5 =
                 new Guest("Karolina", "Tmava",
                         LocalDate.of(1991, 12, 16));

        System.out.println("\n");
        System.out.println(guest1);
        System.out.println(guest2);
        System.out.println("\n");

        // Vytvoreni seznamu hostu a pridanim do seznamu
        List<Guest> guestList = new ArrayList<>();
        guestList.add(guest1);
        guestList.add(guest2);
        guestList.add(guest3);
        guestList.add(guest4);
        guestList.add(guest5);
        System.out.println("Information about guests :"+guestList);
        System.out.println("\n");
        List<Guest> guestOtherList = new ArrayList<>();
        guestOtherList.add(guest2);

        // 2,Vytvoreni pokoju s jejich vypisem na obrazovku

        Room room1 = new Room(1, 1, true, true, 1000);
        Room room2 = new Room(2, 1, true, true, 1000);
        Room room3 = new Room(3, 3, true, false, 2400);


        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);
        System.out.println("\n");


        // 3,Vytvoreni rezervaci za pomoci volani objektu hosta a pokoje
        Booking booking1 = new Booking(guest1, room1,
                LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26),
                true);


        // 7,8,10,Vytvoreni rezervace za pomoci volani objektu hosta a pokoje a pridani dalsiho hosta
        Booking booking2 = new Booking(guest1,
                room3,
                LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14),
                false, guestOtherList);


        Booking booking3 = new Booking(guest3, room3,
                LocalDate.of(2023, 6, 1),
                LocalDate.of(2023, 6, 7),
                true);


        Booking booking4 = new Booking(guest4, room2,
                LocalDate.of(2023, 7, 18),
                LocalDate.of(2023, 7, 21),
                false);


        Booking booking6 = new Booking(guest5, room3,
                LocalDate.of(2023, 8,1),
                LocalDate.of(2023, 8, 31),
                true);





        // 4.Vytvoreni seznamu rezervaci s jejich vypisem na obrazovku


        bookingList.add(booking1);
        bookingList.add(booking2);
        bookingList.add(booking3);
        bookingList.add(booking4);
        bookingList.add(booking6);
        fillListBookings5(bookingList, guest5, room2);


        BookingManager newBooking = new BookingManager();
        newBooking.addAllBookings(bookingList);
        int indexListBooking = 1;
        System.out.println("Vypise rezervaci podle indexu: (" + indexListBooking + newBooking.getBooking(0));
        System.out.print("\n");
        Booking bookingAll = new Booking();
        System.out.println("Pocet vsech hostu: " +newBooking.getNumberOfGuests());
        System.out.println("Pocet vsech rezervaci: " +newBooking.getNumberOfBookings());
        System.out.println("Prumernz pocet hostu na jednu rezervaci: " + newBooking.getAveregeGuests(newBooking.getNumberOfGuests()));

        // 11 Ve tride projektu priprav metodu pro vypis seznamu vsech rezervaci formutu:
        // datum od az datum do : Jmeno hlavniho hosta (datum narozeni) [pocet hostu, vyhled na more ano/ne] za cena
        System.out.println("Vypise vsechny rezervace z BookingManager: ");


            System.out.println("Seznam vsech rezervaci: ");
            for (Booking booking : bookingList) {
                String seaView = booking.getRoom().isViewOnSea() ? "ano" : "ne";
                System.out.println(booking.getCheckIn() + " to "
                        + booking.getCheckOut() + " " + booking.getMainGuest()
                        +"[" + booking.getNumbersOfGuests() + ", " +seaView+ "]" + " price: "
                        +booking.getPrice());
            }

        // 5 vytvoreni metody ktera vraci pocet Working vacations.
        int numberOfWorkingBookings;
        numberOfWorkingBookings = 0;
        for (Booking booking : bookingList) {
            if (booking.getWorkingVacation()) numberOfWorkingBookings++;

        }
        System.out.print("\n");
        System.out.println("Number of Working Vacation is: "+numberOfWorkingBookings + ",");
        }



        // 9. vytvoreni cyklu rezervaci pro jednu osobu na jine datumy
    private static void fillListBookings5(List<Booking> bookingList, Guest guest5, Room room2) {
        int numberOfBookings = 10;
        LocalDate checkIn = LocalDate.of(2023, 8, 1);
        LocalDate checkOut = LocalDate.of(2023, 8, 2);
        for (int i = 0; i < numberOfBookings ; i++)
            {bookingList.add(new Booking(guest5, room2,
                    checkIn,
                    checkOut,
                    false));
                checkIn= checkIn.plusDays(2);
                checkOut = checkOut.plusDays(2);


            }



        }










    }














