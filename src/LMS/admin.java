//package LMS;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class admin {
//
//    public static void menuUI() {
//
//        // -- Create panel object and set layout --
//        JPanel panel = new JPanel();
//        panel.setLayout(new GridLayout(5, 1, 10, 10));
//
//        // -- Create buttons objects --
//        JButton addButton = new JButton("Add Librarian");
//        JButton viewButton = new JButton("View Librarian");
//        JButton deleteButton = new JButton("Delete Librarian");
//        JButton logoutButton = new JButton("Logout");
//
//        // -- Set text lebel font size --
//        JLabel titleLebel = new JLabel("Admin Menu", SwingConstants.CENTER);
//        titleLebel.setFont(new Font("Arial", Font.BOLD, 24));
//
//        // -- Add buttons to panel --
//        panel.add(titleLebel);
//        panel.add(addButton);
//        panel.add(viewButton);
//        panel.add(deleteButton);
//        panel.add(logoutButton);
//
//        // -- Create dialog box --
//        JOptionPane.showOptionDialog(
//                null,
//                panel,
//                "Admin Menu",
//                JOptionPane.DEFAULT_OPTION,
//                JOptionPane.PLAIN_MESSAGE,
//                null,
//                new Object[] {},
//                null);
//    }
//
//    public static void main(String[] args) {
//        menuUI();
//    }
//}




package LMS;
import javax.swing.JOptionPane; 
public class admin {
	
	public static void menuUI() {
		        Object[] options = { "add Books","view Books","issue Book","view issue Book","return Book","logout" }; 
		        //Object[] options = {"logout","registration","delete librarian", "view librarian", "add librarian"}; 

		  
		        // Display an option dialog with custom options 
		        // The user's choice is stored in the 'choice' 
		        // variable 
		        int choice = JOptionPane.showOptionDialog( 
		            null, // Parent component (null means center on screen) 
		            "Do you want to proceed?", // Message to display 
		            "Custom Options", // Dialog title 
		            //JOptionPane.YES_NO_CANCEL_OPTION, // Option type (Yes, No, Cancel) 
		            JOptionPane.DEFAULT_OPTION, // Option type (Yes, No, Cancel) 
		            JOptionPane.QUESTION_MESSAGE, // Message type (question icon) 
		            null, // Custom icon (null means no custom icon) 
		            options, // Custom options array 
		            options// Initial selection (default is "Cancel") 
		        ); 
		        
		        
		        switch (choice) {
	            case 4:
	                JOptionPane.showMessageDialog(null, "issue Book");
	                break;
	            case 3:
					JOptionPane.showMessageDialog(null, "view issue Book");
					break;
	            case 2:
	                JOptionPane.showMessageDialog(null, "view issue Book");
	                break;
	            case 1:
	                JOptionPane.showMessageDialog(null, "return Book");
	                break;
	            case 0:
	                JOptionPane.showMessageDialog(null, "logout");
	                break;
	            default:
	                JOptionPane.showMessageDialog(null, "Operation canceled.");
	                break;
	        }
		  
	}
	 	
	
	    public static void main(String[] args) 
	    { 
	    	menuUI();
	    } 
	}
