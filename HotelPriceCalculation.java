import javax.swing.JOptionPane;

public class HotelPriceCalculation {
    static final int size = 10;
    static Necessity[] NCS = new Necessity[size];
    static int countNCS = 0;

    public HotelPriceCalculation() {
        // Initialize Necessity array in the constructor
        for (int i = 0; i < size; i++) {
            NCS[i] = new Necessity();
        }
    }

    public double NecessityPrice() {
        double NessPrice = 0;
        int nc1;

        nc1 = menu();

        do {
            switch (nc1) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    // Add the price of selected necessity
                    NessPrice += 100;
                    JOptionPane.showMessageDialog(null, "Ness Price is: " + NessPrice);
                    break;
                default:
                    break;
            }
            nc1 = menu();
        } while (nc1 != 0);

        // Store the total necessity price in the Necessity object
        NCS[countNCS] = new Necessity(NessPrice);
        countNCS++;

        return NessPrice;
    }

    public int menu() {
        int ch = Integer.parseInt(JOptionPane.showInputDialog("****Necessity Menu*****"
                + "\n Necessity Menu"
                + "\n 1. Gym (100฿)"
                + "\n 2. Swimming Pool (100฿)"
                + "\n 3. Breakfast (100฿)"
                + "\n 4. Bar Drinks (100฿)"
                + "\n 5. Laundry (100฿)"
                + "\n 6. Roll away bed (100฿)"
                + "\n 0.Nothing else"));

        return ch;
    }
}
