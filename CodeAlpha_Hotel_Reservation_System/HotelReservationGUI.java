import java.awt.*;
import javax.swing.*;

public class HotelReservationGUI extends JFrame {

    private HotelReservationSystem system;
    private JTextArea displayArea;

    public HotelReservationGUI() {

        system = new HotelReservationSystem();

        setTitle("Hotel Reservation System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        displayArea = new JTextArea();
        displayArea.setEditable(false);

        JButton viewRoomsBtn = new JButton("View Rooms");
        JButton bookRoomBtn = new JButton("Book Room");
        JButton viewBookingsBtn = new JButton("View Bookings");

        viewRoomsBtn.addActionListener(e -> viewRooms());
        bookRoomBtn.addActionListener(e -> bookRoom());
        viewBookingsBtn.addActionListener(e -> viewBookings());

        JPanel panel = new JPanel();

        panel.add(viewRoomsBtn);
        panel.add(bookRoomBtn);
        panel.add(viewBookingsBtn);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        setVisible(true);
    }

    private void viewRooms() {

        displayArea.setText("");

        for (Room room : system.getAvailableRooms()) {
            displayArea.append(room.toString() + "\n\n");
        }
    }

    private void bookRoom() {

        try {

            String name = JOptionPane.showInputDialog("Enter Customer Name:");
            String email = JOptionPane.showInputDialog("Enter Email:");
            String phone = JOptionPane.showInputDialog("Enter Phone:");
            int roomId = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter Room ID:")
            );

            String checkIn =
                    JOptionPane.showInputDialog("Enter Check-In Date:");

            String checkOut =
                    JOptionPane.showInputDialog("Enter Check-Out Date:");

            Customer customer =
                    new Customer(1, name, email, phone);

            boolean booked = system.bookRoom(
                    customer,
                    roomId,
                    checkIn,
                    checkOut
            );

            if (booked) {
                JOptionPane.showMessageDialog(
                        this,
                        "Room Booked Successfully!"
                );
            } else {
                JOptionPane.showMessageDialog(
                        this,
                        "Room Not Available!"
                );
            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(
                    this,
                    "Invalid Input!"
            );
        }
    }

    private void viewBookings() {

        displayArea.setText("");

        for (Reservation r : system.getReservations()) {

            displayArea.append(
                    r.toString() + "\n\n"
            );
        }
    }
}