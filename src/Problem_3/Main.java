package Problem_3;

import java.util.Scanner;

public class Main {
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter library capacity: ");
        int n = sc.nextInt();
        sc.nextLine();

        Library lib = new Library(n);

        // Initialize with 2 documents
        lib.add(new Novel("Harry Potter", "J.K Rowling", 500, 20.5));
        lib.add(new Magazine("Science Today", "June", 2024));

        int choice;

        do {
            System.out.println("\n1- Add Document");
            System.out.println("2- Display Documents");
            System.out.println("3- Delete Document");
            System.out.println("4- Display Authors");
            System.out.println("5- Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    lib.add(new Dictionary(title, "English"));
                    break;

                case 2:
                    lib.displayDocuments();
                    break;

                case 3:
                    System.out.print("Enter record number: ");
                    int num = sc.nextInt();
                    Document d = lib.document(num);
                    if (d != null) {
                        lib.delete(d);
                        System.out.println("Deleted.");
                    } else {
                        System.out.println("Not found.");
                    }
                    break;

                case 4:
                    lib.displayAuthors();
                    break;
            }

        } while (choice != 5);
    }
}
