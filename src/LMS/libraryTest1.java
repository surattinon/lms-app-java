package LMS;
import javax.swing.JOptionPane; 
public class libraryTest1 {
	
	public static void menuUI() {
		        //Object[] options = { "add Books","view Books","issue Book","view issue Book","return Book","logout" }; 
		        Object[] options = {"logout","return Book", "view issue Book", "issue Book", "view Books", "add Books"}; 
		  
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
	            case 5:
	                JOptionPane.showMessageDialog(null, "add Books");
	                break;
	            case 4:
	                JOptionPane.showMessageDialog(null, "view Books");
	                break;
	            case 3:
	                JOptionPane.showMessageDialog(null, "issue Book");
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

