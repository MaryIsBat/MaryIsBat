class Necessity {
    private double NESSPRICE;
    private double Gym;
    private double SwimmingPool;
    private double Breakfast;
    private double BarDrinks;
    private double Laundry;
    private double Spa;
    private HotelRoom HotelRoom;

    Necessity() {
    }

    Necessity(double nessprice) {
        this.NESSPRICE = nessprice;
    }

    Necessity(double nessprice, double gym) {
        this.NESSPRICE = nessprice;
        this.Gym = gym;
    }

    Necessity(double nessprice, double gym, double swimmingpool) {
        this.NESSPRICE = nessprice;
        this.Gym = gym;
        this.SwimmingPool = swimmingpool;
    }

    Necessity(double nessprice, double gym, double swimmingpool, double breakfast) {
        this.NESSPRICE = nessprice;
        this.Gym = gym;
        this.SwimmingPool = swimmingpool;
        this.Breakfast = breakfast;
    }

    Necessity(double nessprice, double gym, double swimmingpool, double breakfast, double bardrinks) {
        this.NESSPRICE = nessprice;
        this.Gym = gym;
        this.SwimmingPool = swimmingpool;
        this.Breakfast = breakfast;
        this.BarDrinks = bardrinks;
    }

    Necessity(double nessprice, double gym, double swimmingpool, double breakfast, double bardrinks, double laundry) {
        this.NESSPRICE = nessprice;
        this.Gym = gym;
        this.SwimmingPool = swimmingpool;
        this.Breakfast = breakfast;
        this.BarDrinks = bardrinks;
        this.Laundry = laundry;
    }

    Necessity(double nessprice, double gym, double swimmingpool, double breakfast, double bardrinks, double laundry,
            double spa) {
        this.NESSPRICE = nessprice;
        this.Gym = gym;
        this.SwimmingPool = swimmingpool;
        this.Breakfast = breakfast;
        this.BarDrinks = bardrinks;
        this.Laundry = laundry;
        this.Spa = spa;
    }

    Necessity(double nessprice, double gym, double swimmingpool, double breakfast, double bardrinks, double laundry,
            double spa, HotelRoom HOTELROOM) {
        this.NESSPRICE = nessprice;
        this.Gym = gym;
        this.SwimmingPool = swimmingpool;
        this.Breakfast = breakfast;
        this.BarDrinks = bardrinks;
        this.Laundry = laundry;
        this.Spa = spa;
        this.HotelRoom = HOTELROOM;
    }

    public void setNESSPRICE(double nessprice) {
        this.NESSPRICE = nessprice;
    }

    public double getNESSPRICE() {
        return NESSPRICE;
    }

    public void setGym(double gym) {
        this.Gym = gym;
    }

    public double getGym() {
        return Gym;
    }

    public void setSwimmingPool(double swimmingpool) {
        this.SwimmingPool = swimmingpool;
    }

    public double getSwimmingPool() {
        return SwimmingPool;
    }

    public void setBreakfast(double breakfast) {
        this.Breakfast = breakfast;
    }

    public double getBreakfast() {
        return Breakfast;
    }

    public void setBarDrinks(double bardrinks) {
        this.BarDrinks = bardrinks;
    }

    public double getBarDrinks() {
        return BarDrinks;
    }

    public void setLaundry(double laundry) {
        this.Laundry = laundry;
    }

    public double getLaundry() {
        return Laundry;
    }

    public void setSpa(double spa) {
        this.Spa = spa;
    }

    public double getSpa() {
        return Spa;
    }

    public void setHotelRoom(HotelRoom HOTELROOM) {
        this.HotelRoom = HOTELROOM;
    }

    public HotelRoom getHotelRoom() {
        return HotelRoom;
    }
}