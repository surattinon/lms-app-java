package LMS;

import javax.swing.*;
import java.awt.*;

public class admin {
    int ID;
    String firstName, lastname;

    admin(int ID, String firstName, String lastname) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public static void menuUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));

        JButton addButton = new JButton("Add Librarian");
        JButton viewButton = new JButton("View Librarian");
        JButton deleteButton = new JButton("Delete Librarian");
        JButton logoutButton = new JButton("Logout");

        JLabel titleLebel = new JLabel("Admin Menu", SwingConstants.CENTER);
        titleLebel.setFont(new Font("Arial", Font.BOLD, 24));

        panel.add(titleLebel);
        panel.add(addButton);
        panel.add(viewButton);
        panel.add(deleteButton);
        panel.add(logoutButton);

        JOptionPane.showOptionDialog(
                null,
                panel,
                "Admin Menu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                new Object[] {},
                null);
    }

    public static void main(String[] args) {
        menuUI();
    }
}
