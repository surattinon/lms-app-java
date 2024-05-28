package LMS.Registration;
import javax.swing.JOptionPane;

public class regPane {
	public void regUi() {
		regLogic reg = new regLogic();
		String role;
		String[] roles = {"Admin", "Librian"};
		
		String name = JOptionPane.showInputDialog
				(null, "Please enter your username", "Registrarion", JOptionPane.QUESTION_MESSAGE );
		String pass = JOptionPane.showInputDialog
				(null, "Please enter your password", "Registration", JOptionPane.QUESTION_MESSAGE );
		int optsRoles = JOptionPane.showOptionDialog(
				null,
				"Select role for user",
				"Registration",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				roles,
				roles
				);
		switch (optsRoles) {
		case 0:
			role = "admin";
			reg.addUser(name, pass, role);
			break;
		case 1:
			role = "librarian";
			reg.addUser(name, pass, role);
			break;
		}
		for (int i = 0; i < reg.userArray.length; i++) {
			System.out.printf("User %d is %s. and password is %s, the role of user is %s\n", i+1, reg.getUser(i), reg.getPass(i), reg.getRole(i));
		}
				
	}
	
	public static void main(String[] args) {
		regPane pane = new regPane();
		pane.regUi();
	}
}
