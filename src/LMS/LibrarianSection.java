
package LMS;

import javax.swing.*;
import java.awt.*;

public class LibrarianSection {

    public static void menuUI() {

        // -- Create panel object and set layout --
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 1, 10, 10));

        // -- Create buttons objects --
        JButton addButton = new JButton("Add Books");
        JButton viewButton = new JButton("View Books");
        JButton issueBook = new JButton("Issue Books");
        JButton viewIssueBook= new JButton("View issued Books");
        JButton returnBook = new JButton("Return Books");
        JButton logoutButton = new JButton("Logout");

        // -- Set text lebel font size --
        JLabel titleLebel = new JLabel("Admin Menu", SwingConstants.CENTER);
        titleLebel.setFont(new Font("Arial", Font.BOLD, 24));

        // -- Add buttons to panel --
        panel.add(titleLebel);
        panel.add(addButton);
        panel.add(viewButton);
        panel.add(issueBook);
        panel.add(viewIssueBook);
        panel.add(returnBook);
        panel.add(logoutButton);

        
        // -- Create dialog box --
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

