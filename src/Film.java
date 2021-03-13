public class Film {
    //class which contains attributes for basic film info
    public String title, category, format;
    public double price;
    public int certification;

    public Film(String title, double price, int certification, String category, String format) {
        this.title = title;
        this.price = price;
        this.certification = certification;
        this.category = category;
        this.format = format;
    }
}

