package LMS;
import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		// TEST JOptionPane
		String username = JOptionPane.showInputDialog("Username");
		JOptionPane.showMessageDialog(null, "Hello " + username);
	}
}