package org.opentutorials.javatutorials.overloading.example2;
// 각 메소드의 시그니쳐는 메소드 이름, 매개변수, 리턴타입이다.

public class OverloadingDemo {

    void Sample() {
        System.out.println("void Sample()");
    }
    void Sample(int a) {
        System.out.println("void Sample(int a)");
    }
    void Sample(String as) {
        System.out.println("void Sample (String a)");
    }
//    int Sample() {
//        System.out.println("void Sample()");
//    }

    public static void main(String[] args) {
        OverloadingDemo od = new OverloadingDemo();
        od.Sample();
        od.Sample(1);
        od.Sample("Let`s Go!!");
    }
}

