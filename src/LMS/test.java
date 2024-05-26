package LMS;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    private ArrayList<String> books;

    public test() {
        books = new ArrayList<>();
    }

    public void addBook(String bookTitle) {
        books.add(bookTitle);
    }

    public void removeBook(String bookTitle) {
        books.remove(bookTitle);
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        test library = new test();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Add a book");
            System.out.println("2. View all books");
            System.out.println("3. Remove a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title to add: ");
                    String bookToAdd = scanner.nextLine();
                    library.addBook(bookToAdd);
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    System.out.print("Enter book title to remove: ");
                    String bookToRemove = scanner.nextLine();
                    library.removeBook(bookToRemove);
                    break;
                case 4:
                    System.out.println("Exiting library system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
