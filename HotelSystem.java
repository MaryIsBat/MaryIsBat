import java.util.Random;
import javax.swing.JOptionPane;

class HotelSystem extends HotelRoomStuff {
    static final int size = 10;
    static Customer[] C = new Customer[size];
    static HotelRoom[] HR = new HotelRoom[size];
    static HotelRoomStuff HRS = new HotelRoomStuff();
    static HotelPriceCalculation HPC = new HotelPriceCalculation();
    static HotelSystem HS = new HotelSystem();
    static Necessity[] NCS = new Necessity[size];
    static int countC = 0;
    static int countNCS = 0;
    double totalPrice = 1;
    double nessPrice;
    double roomPrice;

    public static void main(String[] args) {
        int ch1;
        ch1 = HS.menu();
        do {
            switch (ch1) {
                case 1:
                    HS.AddCustomerInfo();
                    break;
                case 2:
                    HS.checkCustomerInfo();
                    break;
                case 3:
                    HRS.showRooms();
                    break;
                case 4:
                    HS.searchCustomerInfo();
                default:
                    break;
            }
            ch1 = HS.menu();
        } while (ch1 != 0);
    }

    public int menu() {
        int ch = Integer.parseInt(JOptionPane.showInputDialog("Select Menu"
                + "\n 1. Add Customer Info"
                + "\n 2. Check Customer Info"
                + "\n 3. Check Room info"
                + "\n 4. Search for info using Customer ID"));
        return ch;
    }

    public void AddCustomerInfo() {
        String cid, cname, cpnum, input, cpaytype, croomnum;
        int cdate;
        double croomnessprice, croomprice;
        cid = getSaltString();
        cname = JOptionPane.showInputDialog("Enter Customer Name:");
        cpnum = JOptionPane.showInputDialog("Enter Customer Phone Number:");
        input = JOptionPane.showInputDialog("How many days will the customer stay?");
        cdate = Integer.parseInt(input);
        HRS.showRooms();
        String[] roomInfo = HRS.selectRooms(); // Get the selected room number and price
        if (roomInfo[0] != null && roomInfo[1] != null) { // Check if room selection was successful
            croomnum = roomInfo[0]; // Assign room number
            croomprice = Double.parseDouble(roomInfo[1]); // Assign room price
            croomnessprice = HPC.NecessityPrice(); // Get the total necessity price
            NCS[countC] = new Necessity(croomnessprice); // Store the total necessity price in the NCS array
            cpaytype = HS.PaymentType(); // Get the payment type
            // Create a new Customer object with all the necessary information
            C[countC] = new Customer(cid, cname, cpnum, cdate, cpaytype, croomnum, croomnessprice, croomprice);
            System.out.println("Room Price: " + croomprice);
            System.out.println("Necessity Price: " + croomnessprice);
            countC++; // Increment customer count
            double totalPrice = calculateTotalPrice(); // Calculate total price
            // Display total price
            JOptionPane.showMessageDialog(null, "Total Price: " + totalPrice);
        }
    }

    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();

        while (salt.length() < 5) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    public void showAvailableRooms() {
        String output = "-----Available Hotel Room-----";
        for (int i = 0; i < size; i++) { // Iterate up to size - 1
            output += "\nRoom Number: " + HR[i].getROOMNUM();
            output += "\nRoom Type: " + HR[i].getROOMTYPE();
            output += "\n-------------------------------";
        }
        JOptionPane.showMessageDialog(null, output);
    }

    public void checkCustomerInfo() {
        String output = "---------Customer Information---------";
        for (int i = 0; i < countC; i++) {
            output += "\nCustomer ID: " + C[i].getCID();
            output += "\nCustomer Name: " + C[i].getCNAME();
            output += "\nCustomer Phone Number: " + C[i].getCPNUM();
            output += "\nCustomer is residing in room: " + C[i].getCROOMNUM();
            output += "\nTotal Price: " + C[i].getCTOTALAMOUNT();
            output += "\nCustomer Payment Method: " + C[i].getCPAYTYPE();
            output += "\n---------------------------------------";
        }
        JOptionPane.showMessageDialog(null, output);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0; // Initialize totalPrice to 0
        for (int i = 0; i < countC; i++) {
            double nessPrice = C[i].getCROOMNESSPRICE(); // Get the necessity price for the current customer
            double roomPrice = C[i].getCROOMPRICE(); // Get the room price for the current customer
            int cdate = C[i].getCDATE(); // Get the number of days the customer will stay
            double customerTotalPrice = (nessPrice + roomPrice) * cdate; // Calculate the total price for the current
                                                                         // customer
            // Set the total price for the current customer
            C[i].setCTOTALAMOUNT(customerTotalPrice);
            // Add the total price of the current customer to the overall total price
            totalPrice = customerTotalPrice;
        }
        return totalPrice; // Return the total price after calculating for all customers
    }

    public String PaymentType() {
        String[] options = { "Cash", "Online", "Credit/Debit card" };
        int choice = JOptionPane.showOptionDialog(null,
                "Choose Payment Type", "Payment Type",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        String paytype;
        switch (choice) {
            case 0: // Case 0 corresponds to "Cash"
                paytype = "Cash";
                JOptionPane.showMessageDialog(null, "Your payment type is: " + paytype);
                break;
            case 1: // Case 1 corresponds to "Online"
                paytype = "Paid online";
                JOptionPane.showMessageDialog(null, "Your payment type is: " + paytype);
                break;
            case 2: // Case 2 corresponds to "Credit/Debit card"
                paytype = "Credit/Debit card";
                JOptionPane.showMessageDialog(null, "Your payment type is: " + paytype);
                break;
            default:
                paytype = "Invalid";
                break;
        }
        return paytype;
    }

    public void searchCustomerInfo() {
        String cid = JOptionPane.showInputDialog("Enter Customer ID (CID):");
        if (cid != null && !cid.isEmpty()) {
            boolean customerFound = false;
            for (int i = 0; i < countC; i++) {
                if (C[i].getCID().equals(cid)) { // Compare CID with the provided CID
                    StringBuilder customerInfo = new StringBuilder();
                    customerInfo.append("Customer ID: ").append(C[i].getCID()).append("\n");
                    customerInfo.append("Customer Name: ").append(C[i].getCNAME()).append("\n");
                    customerInfo.append("Customer Phone Number: ").append(C[i].getCPNUM()).append("\n");
                    customerInfo.append("Customer is residing in room: ").append(C[i].getCROOMNUM()).append("\n");
                    customerInfo.append("Customer Payment Method: ").append(C[i].getCPAYTYPE()).append("\n");
                    customerInfo.append("Total Price: ")
                            .append((C[i].getCROOMPRICE() + C[i].getCROOMNESSPRICE()) * C[i].getCDATE()).append("\n");
                    JOptionPane.showMessageDialog(null, customerInfo.toString());
                    customerFound = true;
                    break; // Stop iterating once the customer is found
                }
            }
            if (!customerFound) {
                JOptionPane.showMessageDialog(null, "Customer with ID " + cid + " not found.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid ID. Please enter a valid ID.");
        }
    }

}