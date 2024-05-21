package org.opentutorials.javatutorials.polymorphism;

class O {
    public void a(int int_param) {
        System.out.println("int출력");
        System.out.println(int_param);
    }
    public void a(String string_param) {
        System.out.println("String출력");
        System.out.println(string_param);
    }
}

//class 안에 overloading된 매소드를 호출해도 각각 다른 타입으로 사용 가능
public class PolymorphismOverloadingDemo {
    public static void main(String[] args) {
        O o = new O();
        o.a(1);
        o.a("one");
    }
}
