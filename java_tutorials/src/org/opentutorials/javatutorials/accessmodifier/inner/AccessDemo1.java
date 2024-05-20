package org.opentutorials.javatutorials.accessmodifier.inner;

class A {

    public String y() {
        return "publc String y()";
    }

    private String z() {
        return "private String z()";
    }

    public String x() {
        return z();
    }

}

public class AccessDemo1 {
    public static void main(String[] args) {
        A a = new A();

        System.out.println(a.y());
        //private는 저 의에 클래스 안에서만 접근 가능
        //System.out.println(a.z());
        //이렇게 우회 가능
        System.out.println(a.x());
    }
}
