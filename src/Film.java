public class Film {
    //class which contains attributes for basic film info
    public String title,certString;
    public double price;
    public int certification;

    public Film(String title, double price, int certification, String certString) {
        this.title = title;
        this.price = price;
        this.certification = certification;
        this.certString = certString;
    }
}

