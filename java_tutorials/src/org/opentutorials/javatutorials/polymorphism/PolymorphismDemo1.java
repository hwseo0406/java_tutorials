package org.opentutorials.javatutorials.polymorphism;

class A {
    public String x() {return "A.x";}
}

class B extends A {
    public String x() {return "B.x";}
    public String y() {return "y";}
}

class B2 extends A {
    public String x() {return "B2.x";}
}

//부모클래스 데이터타입으로 자식클래스 인스턴스 사용 가능
public class PolymorphismDemo1 {
    public static void main(String[] args) {
        A obj = new B();
        A obj2 = new B2();
        //B.x 출력, y()는 출력 불가, overriding된 매소드는 사용 가능
        System.out.println(obj.x());
        System.out.println(obj2.x());
        //obj.x();
        //obj.y();
    }
}
