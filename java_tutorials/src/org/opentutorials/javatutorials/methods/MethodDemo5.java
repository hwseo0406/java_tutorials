package org.opentutorials.javatutorials.methods;

import java.io.*;

public class MethodDemo5 {
	
	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		while(i < limit) {
			output += i;
			i++;
		}
		return output;
	}

	public static void main(String[] args) {
		String result = numbering(1,5);
		System.out.println(result);
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(result);
			out.close();
		} catch (IOException e) {
			
		}

	}

}
