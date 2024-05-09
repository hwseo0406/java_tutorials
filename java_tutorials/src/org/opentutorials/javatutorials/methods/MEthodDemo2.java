package org.opentutorials.javatutorials.methods;

public class MEthodDemo2 {
	
	public static void numbering() {
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		int j = 0;
		while(j<5) {
			numbering();
			System.out.println("반복 수 : " + j);
			j++;
		}
	}

}
