package LMS;

import java.util.ArrayList;

public class librarianlists {

    int ID;
    String first_name;
    String last_name;
    static ArrayList<librarianlists> librarians = new ArrayList<>();

    public librarianlists(int ID, String first_name, String last_name) {
        this.ID = ID;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public void getLibrarian() {
        System.out.println("ID: " + ID);
        System.out.println("First Name: " + first_name);
        System.out.println("Last Name: " + last_name);
    }

    public static void addLibrarian(librarianlists librarian) {
        librarians.add(librarian);
    }

    public static void main(String[] args) {
        librarianlists.addLibrarian(new librarianlists(1, "John", "Doe"));
        librarianlists.addLibrarian(new librarianlists(2, "Jane", "Doe"));
        librarianlists.addLibrarian(new librarianlists(3, "Alice", "Smith"));

        for (librarianlists librarian : librarians) {
            librarian.getLibrarian();
        }
    }
}
