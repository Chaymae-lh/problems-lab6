package Problem_3;

public class Document {

    private static int counter = 1;   // auto-increment
    private int numEnrg;
    private String title;

    public Document(String title) {
        this.numEnrg = counter++;
        this.title = title;
    }

    public int getNumEnrg() {
        return numEnrg;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Document [numEnrg=" + numEnrg + ", title=" + title + "]";
    }
}