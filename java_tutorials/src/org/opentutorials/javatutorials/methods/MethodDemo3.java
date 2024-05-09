package org.opentutorials.javatutorials.methods;

public class MethodDemo3 {
	//메소드 안에 입력값을 받게 해서 더 다양한 재활용 가능
	//프로그램중에 고정적인 것 보다 가변적인 것에 집중할 수 있게 해야함
	public static void numbering(int init, int limit) {
		int i = init;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		numbering(3,8); //인자,argument라고 함
	}

}
