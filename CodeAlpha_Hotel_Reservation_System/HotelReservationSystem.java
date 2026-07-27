import java.util.ArrayList;

public class HotelReservationSystem {

    private ArrayList<Room> rooms;
    private ArrayList<Reservation> reservations;

    public HotelReservationSystem() {
        rooms = new ArrayList<>();
        reservations = new ArrayList<>();

        // Sample Rooms
        rooms.add(new Room(101, "Standard", 1000));
        rooms.add(new Room(102, "Deluxe", 2000));
        rooms.add(new Room(103, "Suite", 3500));
    }

    public ArrayList<Room> getAvailableRooms() {
        ArrayList<Room> availableRooms = new ArrayList<>();

        for (Room room : rooms) {
            if (room.isAvailable()) {
                availableRooms.add(room);
            }
        }

        return availableRooms;
    }

    public boolean bookRoom(Customer customer,
                            int roomId,
                            String checkIn,
                            String checkOut) {

        for (Room room : rooms) {

            if (room.getRoomId() == roomId && room.isAvailable()) {

                room.setAvailable(false);

                Reservation reservation = new Reservation(
                        reservations.size() + 1,
                        customer,
                        room,
                        checkIn,
                        checkOut
                );

                reservations.add(reservation);

                FileManager.saveReservation(reservation);

                return true;
            }
        }

        return false;
    }

    public boolean cancelReservation(int reservationId) {

        for (Reservation reservation : reservations) {

            if (reservation.getReservationId() == reservationId) {

                reservation.getRoom().setAvailable(true);

                reservations.remove(reservation);

                return true;
            }
        }

        return false;
    }

    public Reservation findReservation(int reservationId) {

        for (Reservation reservation : reservations) {

            if (reservation.getReservationId() == reservationId) {
                return reservation;
            }
        }

        return null;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
}