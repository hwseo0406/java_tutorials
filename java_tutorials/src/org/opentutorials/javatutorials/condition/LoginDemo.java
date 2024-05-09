package org.opentutorials.javatutorials.condition;

public class LoginDemo {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if(id.equals("hse05078")) {
			if (password.equals("1234")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
	} else {
		System.out.println("wrong");
	}
}
}
