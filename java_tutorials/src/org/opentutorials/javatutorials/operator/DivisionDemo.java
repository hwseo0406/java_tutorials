package org.opentutorials.javatutorials.operator;

public class DivisionDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		float d = 3.0F;
		
		System.out.println(a/b); //정수끼리 나누면 정수
		System.out.println(c/d); //실수끼리 나누면 실수
		System.out.println(a/d); //정수 나누기 실수 하면 실수로

	}

}
