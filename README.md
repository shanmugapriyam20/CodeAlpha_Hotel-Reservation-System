# 🏨 Hotel Reservation System

A Java Swing based desktop application for managing hotel room bookings.  
This project is part of **CodeAlpha Internship - Task 4** 🚀

This GUI application allows users to view available rooms, book rooms, and view all reservations. All booking data is stored in `bookings.txt`.

## ✨ Features
- **🛏️ View Available Rooms**: Display all rooms with ID, Type, Price, and Availability
- **✅ Book a Room**: Book rooms through a popup dialog with customer details and dates
- **📋 View Bookings**: View all current reservations with customer and room details
- **💾 Persistent Storage**: Bookings are saved to and loaded from `bookings.txt`
- **🖥️ Simple GUI**: Clean Java Swing interface with 3 main buttons
- **🔒 Room Availability**: Booked rooms automatically become unavailable

## 🛠️ Tech Stack
- **Language**: ☕ Java
- **GUI Framework**: 🖼️ Java Swing, AWT
- **Data Storage**: 📄 File I/O using `bookings.txt`
- **IDE**: 💻 VS Code

## 📂 Project Structure
```
Hotel_Reservation_System/
├── Main.java                   # Entry point - launches the GUI
├── HotelReservationGUI.java    # Main Swing GUI with buttons and dialogs
├── HotelReservationSystem.java # Core booking, cancellation logic
├── Room.java                   # Room class: id, type, price, isAvailable
├── Customer.java               # Customer class: name, email, phone
├── Reservation.java            # Reservation class: customer, room, dates
├── Payment.java                # Payment status handling
└── FileManager.java            # Read/Write bookings to file
```

## 🚀 How to Run

### Prerequisites
- Java JDK 8 or above installed

### Steps
1. **Open the project in VS Code**
2. **Compile all Java files**
   ```bash
   javac *.java
   ```
   
3. Run the application
   ```bash 
     java Main
   ```
4. A GUI window will open with 3 buttons: `View Rooms`, `Book Room`, `View Bookings`

 
##📸 Application Output


### Main Window
The application starts with a window containing 3 buttons: `View Rooms` `Book Room` `View Bookings`
### View Rooms Output
```
Room ID: 101, Type: Standard, Price: ₹1000.0, Available: true
Room ID: 102, Type: Deluxe, Price: ₹2000.0, Available: true
Room ID: 103, Type: Suite, Price: ₹3500.0, Available: true
```
### Book Room Dialog
Clicking "Book Room" opens a dialog to enter:

Customer Name, Email, Phone, Room ID, Check-In Date, Check-Out Date


After booking, the room status changes to `Available: false`


## 📌 Key Details
- **Default Rooms**:
    - 101 - Standard - ₹1000
    - 102 - Deluxe - ₹2000
    - 103 - Suite - ₹3500
- Once booked, a room cannot be booked again until data is reset
- All bookings are stored in `bookings.txt` in the project folder


## 👨‍💻 Author


**Shanmugapriya M**

CodeAlpha Internship - Task 4: Hotel Reservation System
📅 July 2026


## 🙏 Acknowledgements 


Thank you **CodeAlpha** for this internship opportunity to build real-world Java GUI applications! 💙

### **Now do this in VS Code:**
```bash
git add README.md
git commit -m "Final README with GUI details for Task 4"
git push
