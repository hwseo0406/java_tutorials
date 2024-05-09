package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class Scanner2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //사용자가 입력한 값
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt()*1000);
		}
		System.out.println("종료");
		sc.close();
		

	}

}
