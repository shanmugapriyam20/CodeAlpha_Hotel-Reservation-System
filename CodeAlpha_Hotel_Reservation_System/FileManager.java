import java.io.*;
import java.util.ArrayList;

public class FileManager {

    private static final String FILE_NAME = "bookings.txt";

    public static void saveReservation(Reservation reservation) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {

            writer.write(
                reservation.getReservationId() + "," +
                reservation.getCustomer().getName() + "," +
                reservation.getRoom().getRoomId() + "," +
                reservation.getRoom().getRoomType() + "," +
                reservation.getCheckInDate() + "," +
                reservation.getCheckOutDate()
            );

            writer.newLine();

        } catch (IOException e) {
            System.out.println("Error saving reservation: " + e.getMessage());
        }
    }

    public static ArrayList<String> loadReservations() {

        ArrayList<String> reservations = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = reader.readLine()) != null) {
                reservations.add(line);
            }

        } catch (IOException e) {
            System.out.println("No booking records found.");
        }

        return reservations;
    }
}