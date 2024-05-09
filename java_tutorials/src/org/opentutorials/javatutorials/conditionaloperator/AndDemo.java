package org.opentutorials.javatutorials.conditionaloperator;

public class AndDemo {

	public static void main(String[] args) {
		if (true && true) {        //&&는 and 라는 뜻
			System.out.println(1); //출력
		}
		
		if (true && false) {
			System.out.println(2); //출력 안함
		}
		
		if (false && true) {
			System.out.println(2); //출력 안함
		}
		
		if (false && false) {
			System.out.println(2); //출력 안함
		}

	}

}
