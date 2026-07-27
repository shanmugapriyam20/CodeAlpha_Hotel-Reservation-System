public class Reservation {
    private int reservationId;
    private Customer customer;
    private Room room;
    private String checkInDate;
    private String checkOutDate;

    public Reservation(int reservationId, Customer customer,
                       Room room, String checkInDate,
                       String checkOutDate) {
        this.reservationId = reservationId;
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public int getReservationId() {
        return reservationId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    @Override
    public String toString() {
        return "Reservation ID: " + reservationId +
               "\nCustomer: " + customer.getName() +
               "\nRoom: " + room.getRoomId() +
               " (" + room.getRoomType() + ")" +
               "\nCheck-In: " + checkInDate +
               "\nCheck-Out: " + checkOutDate;
    }
}