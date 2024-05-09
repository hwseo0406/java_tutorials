package org.opentutorials.javatutorials.operator;

public class ArithmeticDemo {

	public static void main(String[] args) {
		//result의 값은 3
		int result = 1 + 2;
		System.out.println(result);
		
		//result의 값은 2
		result = result - 1;
		System.out.println(result);
		
		//result의 값은 4
		result = result * 2;
		System.out.println(result);
		
		//result의 값은 10
		result = result + 6;
		System.out.println(result);

		//result의 값은 5
		result = result / 2;
		System.out.println(result);

		//result의 값은 2
		result = result % 3; //나머지 연산
		System.out.println(result);
	}

}
