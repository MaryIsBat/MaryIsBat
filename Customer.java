class Customer {
    private String CID;
    public String CNAME;
    private String CPNUM;
    private int CDATE;
    private String CPAYTYPE;
    private int CAMOUNT;
    private HotelRoom HOTELROOM;
    public String CROOMNUM;
    public String CROOMTYPE;
    private String CROOMNESS;
    private double CROOMPRICE;
    private double CROOMNESSPRICE;
    public String setROOMNUM;
    public String setROOMTYPE;
    public double CTOTALAMOUNT;

    Customer() {
    }

    Customer(String cid, String cname) {
        this.CID = cid;
        this.CNAME = cname;
    }

    Customer(String cid, String cname, String cpnum, int cdate) {
        this.CID = cid;
        this.CNAME = cname;
        this.CPNUM = cpnum;
        this.CDATE = cdate;
    }

    Customer(String cid, String cname, String cpnum, int cdate, String cpaytype, String croomnum,
            double croomnessprice, double croomprice) {
        this.CID = cid;
        this.CNAME = cname;
        this.CPNUM = cpnum;
        this.CDATE = cdate;
        this.CPAYTYPE = cpaytype;
        this.CROOMNUM = croomnum;
        this.CROOMNESSPRICE = croomnessprice;
        this.CROOMPRICE = croomprice;

    }

    public void setCID(String cid) {
        this.CID = cid;
    }

    public String getCID() {
        return CID;
    }

    public void setCNAME(String cname) {
        this.CNAME = cname;
    }

    public String getCNAME() {
        return CNAME;
    }

    public void setCPNUM(String cpnum) {
        this.CPNUM = cpnum;
    }

    public String getCPNUM() {
        return CPNUM;
    }

    public void setCDATE(int cdate) {
        this.CDATE = cdate;
    }

    public int getCDATE() {
        return CDATE;
    }

    public void setCPAYTYPE(String cpaytype) {
        this.CPAYTYPE = cpaytype;
    }

    public String getCPAYTYPE() {
        return CPAYTYPE;
    }

    public void setCAMOUNT(int camount) {
        this.CAMOUNT = camount;
    }

    public int getCAMOUNT() {
        return CAMOUNT;
    }

    public HotelRoom getHOTELROOM() {
        return HOTELROOM;
    }

    Customer(String croomnum) {
        this.CROOMNUM = croomnum;
    }

    Customer(double croomprice) {
        this.CROOMPRICE = croomprice;
    }

    Customer(String croomnum, String croomtype, double croomprice) {
        this.CROOMNUM = croomnum;
        this.CROOMTYPE = croomtype;
        this.CROOMPRICE = croomprice;
    }

    Customer(String croomnum, String croomtype, String croomness, double croomprice, double croomnessprice) {
        this.CROOMNUM = croomnum;
        this.CROOMTYPE = croomtype;
        this.CROOMNESS = croomness;
        this.CROOMPRICE = croomprice;
        this.CROOMNESSPRICE = croomnessprice;
    }

    public String setCROOMNUM(String croomnum) {
        return this.CROOMNUM = croomnum;
    }

    public String getCROOMNUM() {
        return CROOMNUM;
    }

    public void setCROOMTYPE(String croomtype) {
        this.CROOMTYPE = croomtype;
    }

    public String getCROOMTYPE() {
        return CROOMTYPE;
    }

    public void setCROOMNESS(String croomness) {
        this.CROOMNESS = croomness;
    }

    public String getCROOMNESS() {
        return CROOMNESS;
    }

    public void setCROOMPRICE(double croomprice) {
        this.CROOMPRICE = croomprice;
    }

    public double getCROOMPRICE() {
        return CROOMPRICE;
    }

    public void setCROOMNESSPRICE(double croomnessprice) {
        this.CROOMNESSPRICE = croomnessprice;
    }

    public double getCROOMNESSPRICE() {
        return CROOMNESSPRICE;
    }

    public void setCTOTALAMOUNT(double ctotalamount) {
        this.CTOTALAMOUNT = ctotalamount;
    }

    public double getCTOTALAMOUNT() {
        return CTOTALAMOUNT;
    }

}