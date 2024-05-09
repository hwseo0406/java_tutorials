package org.opentutorials.javatutorials.condition;

public class SwitchDemo {

	public static void main(String[] args) {
		System.out.println("switch(1)");
		switch(4) { //값에 1을 넣으면 case 1,2,3 다 실행 1만 실행시키고 싶으면 case 1 뒤에 break 추가
		case 1:
			System.out.println("one");
			// break;
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		default:
			System.out.println("어느 값에도 해당하지 않으면 이 값 출력");
		}
		
		{
		System.out.println("\nelse if");
		int val = 2;
		if(val == 1) {
			System.out.println("one");
		} else if(val == 2) {
			System.out.println("two");
		} else if(val == 3) {
			System.out.println("three");
		}
		}
	} 

}
