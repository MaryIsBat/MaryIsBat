
public class HotelRoom {
    public String ROOMNUM;
    public String ROOMTYPE;
    private String ROOMNESS;
    private double ROOMPRICE;
    private double ROOMNESSPRICE;
    public String setROOMNUM;
    public String setROOMTYPE;
    private boolean available;
    private Customer CUSTOMER;

    HotelRoom() {
    }

    HotelRoom(String roomnum) {
        this.ROOMNUM = roomnum;
    }

    HotelRoom(double roomprice) {
        this.ROOMPRICE = roomprice;
    }

    HotelRoom(String roomnum, String roomtype, double roomprice) {
        this.ROOMNUM = roomnum;
        this.ROOMTYPE = roomtype;
        this.ROOMPRICE = roomprice;
        this.available = true;
    }

    HotelRoom(String roomnum, String roomtype, String roomness, double roomprice, double roomnessprice) {
        this.ROOMNUM = roomnum;
        this.ROOMTYPE = roomtype;
        this.ROOMNESS = roomness;
        this.ROOMPRICE = roomprice;
        this.ROOMNESSPRICE = roomnessprice;
    }

    public void setROOMNUM(String roomnum) {
        this.ROOMNUM = roomnum;
    }

    public String getROOMNUM() {
        return ROOMNUM;
    }

    public void setROOMTYPE(String roomtype) {
        this.ROOMTYPE = roomtype;
    }

    public String getROOMTYPE() {
        return ROOMTYPE;
    }

    public void setROOMNESS(String roomness) {
        this.ROOMNESS = roomness;
    }

    public String getROOMNESS() {
        return ROOMNESS;
    }

    public void setROOMPRICE(double roomprice) {
        this.ROOMPRICE = roomprice;
    }

    public double getROOMPRICE() {
        return ROOMPRICE;
    }

    public void setROOMNESSPRICE(double roomnessprice) {
        this.ROOMNESSPRICE = roomnessprice;
    }

    public double getROOMNESSPRICE() {
        return ROOMNESSPRICE;
    }

    public boolean roomAvailable() {
        return available;
    }

    public void setRoomAvailability(boolean available) {
        this.available = available;
    }

    public Customer getCUSTOMER() {
        return CUSTOMER;
    }

}
