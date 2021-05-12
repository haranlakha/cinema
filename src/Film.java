public class Film {
    //class which contains attributes for basic film info
    private String title, certString;
    private double price;
    private int certification, noOfTickets;

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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCertString() {
        return certString;
    }

    public void setCertString(String certString) {
        this.certString = certString;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCertification() {
        return certification;
    }

    public void setCertification(int certification) {
        this.certification = certification;
    }

    public int getNoOfTickets() {
        return noOfTickets;
    }

    public void setNoOfTickets(int noOfTickets) {
        this.noOfTickets = noOfTickets;
    }

    public void buyTicket(int n){
        this.noOfTickets -= n;
    }
}

