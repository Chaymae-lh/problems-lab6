package Problem_3;

public class Textbook extends Book {

    private String level;

    public Textbook(String title, String author, int pages, String level) {
        super(title, author, pages);
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", level=" + level;
    }
}