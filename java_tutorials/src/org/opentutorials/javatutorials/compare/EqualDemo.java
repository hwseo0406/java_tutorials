package org.opentutorials.javatutorials.compare;

public class EqualDemo {

	public static void main(String[] args) {
		System.out.println(1 == 2); //false
		System.out.println(1 == 1); //true
		System.out.println("one" == "two"); //false
		System.out.println("one" == "one"); //true 꼭 숫자만은 아니고 문자열도 비교연산 가능
		System.out.println(1 != 2); //true
		System.out.println("one" != "one"); //false
		System.out.println(1 < 2); //true
		System.out.println(1 <= 2); //true
		
		String a = "Hello World";
		String b = new String("Hello World");
		System.out.println(a == b);
		System.out.println(a.equals(b)); //비교연산함수라고 생각하면 될듯
	}

}
