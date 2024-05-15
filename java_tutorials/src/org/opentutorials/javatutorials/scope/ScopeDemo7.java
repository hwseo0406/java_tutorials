package org.opentutorials.javatutorials.scope;

class C {
    String v = "전역변수 10";

    void m() {
        String v = "지역변수 20";
        System.out.println(this.v); //this는 이 클래스에서 사용하는 변수를 사용하고 싶을 때!!!!!
        System.out.println(v);
    }
}

public class ScopeDemo7 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.m();
    }
}
