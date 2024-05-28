package LMS;

import java.util.ArrayList;
import javax.swing.*;

public class librarianlists {

    private int ID;
    private String first_name;
    private String last_name;
    private static ArrayList<librarianlists> librarians = new ArrayList<>();

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

    public static void addLibrarian() {
        while (true) {
            String IDinput = JOptionPane.showInputDialog("Enter ID:");
            if (IDinput == null || IDinput.isEmpty()) {
                break;
            }
            int ID = Integer.parseInt(IDinput);

            String firstNameInput = JOptionPane.showInputDialog("Enter First Name:");
            if (firstNameInput == null || firstNameInput.isEmpty()) {
                break;
            }

            String lastNameInput = JOptionPane.showInputDialog("Enter Last Name:");
            if (lastNameInput == null || lastNameInput.isEmpty()) {
                break;
            }

            librarianlists librarian = new librarianlists(ID, firstNameInput, lastNameInput);
            librarians.add(librarian);

            int option = JOptionPane.showConfirmDialog(null, "Do you want to add another librarian?", "Continue", JOptionPane.YES_NO_OPTION);
            if (option != JOptionPane.YES_OPTION) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        addLibrarian();
        
        for (librarianlists librarian : librarians) {
            librarian.getLibrarian();
        }
    }
}
