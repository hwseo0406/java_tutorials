package org.opentutorials.javatutorials.conditionaloperator;

public class LoginDemo2 {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if ((id.equals("hse05078") || id.equals("shwshw")) && password.equals("1234")){//if (id.equals("hse05078") && password.equals("1234")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
	}

}


