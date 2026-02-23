package Problem_3;

import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Document> documents;

    public Library(int capacity) {
        this.capacity = capacity;
        documents = new ArrayList<>();
    }

    public boolean add(Document doc) {
        if (documents.size() < capacity) {
            documents.add(doc);
            return true;
        }
        return false;
    }

    public boolean delete(Document doc) {
        return documents.remove(doc);
    }

    public Document document(int numEnrg) {
        for (Document d : documents) {
            if (d.getNumEnrg() == numEnrg) {
                return d;
            }
        }
        return null;
    }

    public void displayDocuments() {
        for (Document d : documents) {
            System.out.println(d);
        }
    }

    public void displayAuthors() {
        for (Document d : documents) {
            if (d instanceof Book) {
                Book b = (Book) d;
                System.out.println(b.getAuthor());
            }
        }
    }
}
