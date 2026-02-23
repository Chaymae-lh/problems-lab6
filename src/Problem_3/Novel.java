package Problem_3;

public class Novel extends Book {

    private double price;

    public Novel(String title, String author, int pages, double price) {
        super(title, author, pages);
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", price=" + price;
    }
}
