package org.opentutorials.javatutorials.packages.example3;
import org.opentutorials.javatutorials.packages.example1.*;
import org.opentutorials.javatutorials.packages.example2.*;

public class D {
    public static void main(String[] args) {
        org.opentutorials.javatutorials.packages.example1.B b =
                new org.opentutorials.javatutorials.packages.example1.B();
    }
}
//중복된 class를 import 해왔을 땐 에러가 발생함.
//저렇게 인스턴스화 할 때 패키지를 다 명명해줘도 됨