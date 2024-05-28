package LMS.Registration;
import java.util.Scanner;

public class regLogic {
	String[][] userArray; // Create 2D Array
	int numItems; // Create field numItems
	
	// Create constructor to set default value to array and field
	public regLogic() {
		userArray = new String[1][3]; // Set array to 1 column and 3 rows
		numItems = 0; // Set numItems to 0
	}
	
	// Method for add user contain 3 parameters
	public void addUser(String user, String pass, String role) {
		if ( numItems == userArray.length ) { // Check if numItems is equals to userArray length
			growArray();
		}
		userArray[numItems][0] = user; // set user value for array to column x, row 0
		userArray[numItems][1] = pass; // set user value for array to column x, row 1
		userArray[numItems][2] = role; // set user value for array to column x, row 2
		numItems++; // numItems + 1
	}
	
	
	public void rmItem() {
		numItems--;
	}

	// Create 3 method to get user Info
	public String getUser(int index) {
		return userArray[index][0];
	}
	public String getPass(int index) {
		return userArray[index][1];
	}
	public String getRole(int index) {
		return userArray[index][2];
	}
	
	// Method to grow the existing array length and copy old array to new array
	public void growArray() {
		String[][] tempArr = new String[userArray.length+1][3]; // Create array to store data in temporary
		for (int i = 0; i < numItems; i++) { // loop for copy 
			tempArr[i][0] = userArray[i][0];
			tempArr[i][1] = userArray[i][1];
			tempArr[i][2] = userArray[i][2];
		}
		userArray = tempArr;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		regLogic reg = new regLogic();
		
		String name;
		String pass;
		String role;
		loop: while (true) {
			System.out.print("username:");
			name = input.next();
			System.out.print("password:");
			pass = input.next();
			System.out.print("role:");
			role = input.next();
			reg.addUser(name, pass, role);

			int opts;
			System.out.print("type 1 to add user, 0 to display user and exit:");
			opts = input.nextInt();
			switch (opts) {
			case 0:
				for (int i = 0; i < reg.userArray.length; i++) {
					System.out.printf("User %d is %s. and password is %s, usere role is %s\n", i+1, reg.getUser(i), reg.getPass(i), reg.getRole(i));
				}
				break loop;
			case 1:
				break;
			}
		}
	}
}
