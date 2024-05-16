package org.opentutorials.javatutorials.overloading.example2;

public class OverloadingDemo2 extends OverloadingDemo {

    void Sample(String a, String b) {
        System.out.println("sub class : void(String a, String b)");
    }
    void Sample() {
        System.out.println("sub class: void Sample()"); //같은 구조의 메소드가 부모클래스에 있기 때문에 이건 overriding임
    }

    public static void main(String[] args) {
        OverloadingDemo2 od2 = new OverloadingDemo2();
        od2.Sample();
        od2.Sample(1);
        od2.Sample("sample string");
        od2.Sample("sample string", "sample string");
    }

}
