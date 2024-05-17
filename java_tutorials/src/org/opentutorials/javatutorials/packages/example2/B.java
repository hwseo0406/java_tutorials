package org.opentutorials.javatutorials.packages.example2;

import org.opentutorials.javatutorials.packages.example1.A; //다른 패키지에 있기 떄문에 import 해줘야함
//import org.opentutorials.javatutorials.packages.example1.*;  //이 import는 example1의 모든 패키지를 가져옴

public class B {
    public static void main(String[] args) {
        A a = new A();
    }
}
