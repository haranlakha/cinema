public class Film {
    //class which contains attributes for basic film info
    private final String title;
    private final String certString;
    private final double price;
    private final int certification;
    private int noOfTickets;

    public Film(String filmTitle, double filmPrice, int filmCert, String filmCertString, int filmTickets) {
        title = filmTitle;
        price = filmPrice;
        certification = filmCert;
        certString = filmCertString;
        noOfTickets = filmTickets;
    }

    public String getTitle() {
        return title;
    }

    public String getCertString() {
        return certString;
    }

    public double getPrice() {
        return price;
    }

    public int getCertification() {
        return certification;
    }

    public int getNoOfTickets() {
        return noOfTickets;
    }

    public void buyTicket(int n){
        this.noOfTickets -= n;
    }
}

