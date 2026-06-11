import javax.swing.JOptionPane;

class HotelRoomStuff {
    static final int size = 10;
    static HotelRoom[] HR = new HotelRoom[size];
    static Customer[] C = new Customer[size];
    static int countHR = 0;

    public void createRooms() {
        String roomnum, roomtype;
        int roomprice;

        if (countHR > 0) {
            return; // Rooms have already been created, so return without creating them again
        }

        // Create big rooms
        for (int i = 0; i < 5; i++) {
            roomnum = "Room Number: " + ("B" + (i + 1));
            roomtype = "Big";
            roomprice = 500;
            HR[countHR] = new HotelRoom(roomnum, roomtype, roomprice);
            countHR++;
        }

        // Create small rooms
        for (int i = 5; i <= 9; i++) {
            roomnum = "Room Number: " + ("S" + (i + 1));
            roomtype = "Small";
            roomprice = 350;
            HR[countHR] = new HotelRoom(roomnum, roomtype, roomprice);
            countHR++;
        }

    }

    public void showRooms() {
        createRooms();
        StringBuilder output = new StringBuilder("---Hotel Rooms / Big---\n");
        for (int i = 0; i <= 4; i++) {
            if (HR[i].roomAvailable()) {
                output.append("\n").append(HR[i].getROOMNUM());
                output.append("\nRoom Type: ").append(HR[i].getROOMTYPE());
                output.append("\nRoom Price: ").append(HR[i].getROOMPRICE()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, output);
        StringBuilder output2 = new StringBuilder("---Hotel Rooms / Small---\n");
        for (int i = 5; i <= 9; i++) {
            if (HR[i].roomAvailable()) {
                output2.append("\n").append(HR[i].getROOMNUM());
                output2.append("\nRoom Type: ").append(HR[i].getROOMTYPE());
                output2.append("\nRoom Price: ").append(HR[i].getROOMPRICE()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, output2);

    }

    public String[] selectRooms() {
        String[] roomInfo = new String[2]; // Initialize an array to hold room number and price
        int roomIndex = Integer.parseInt(JOptionPane.showInputDialog("Enter the room Number:"));
        if (roomIndex >= 0 && roomIndex < countHR) {
            roomIndex = roomIndex - 1;
            if (HR[roomIndex].roomAvailable()) {
                HR[roomIndex].setRoomAvailability(false);
                // Show the details of the selected room
                StringBuilder roomDetails = new StringBuilder();
                roomDetails.append("Selected Room Details:\n");
                roomDetails.append("Room Number: ").append(HR[roomIndex].getROOMNUM()).append("\n");
                roomDetails.append("Room Type: ").append(HR[roomIndex].getROOMTYPE()).append("\n");
                roomDetails.append("Room Price: ").append(HR[roomIndex].getROOMPRICE()).append("\n");
                JOptionPane.showMessageDialog(null, roomDetails.toString());
                JOptionPane.showMessageDialog(null, HR[roomIndex].getROOMNUM() + " is now booked.");
                // Set roomInfo array with room number and price
                roomInfo[0] = HR[roomIndex].getROOMNUM();
                roomInfo[1] = String.valueOf(HR[roomIndex].getROOMPRICE());
            } else {
                JOptionPane.showMessageDialog(null, HR[roomIndex].getROOMNUM() + " is not available.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid room number.");
        }
        return roomInfo; // Return room number and price
    }

}