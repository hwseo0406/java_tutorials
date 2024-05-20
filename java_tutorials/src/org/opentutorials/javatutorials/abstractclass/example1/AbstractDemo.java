package org.opentutorials.javatutorials.abstractclass.example1;

abstract class A {
    public abstract int b();
    //본체 내용이 있는 메소드는 abstract가 될 수 없음
    //public abstract int c() {System.out.println("Hello")}
    public void d() {
        System.out.println("method in abstract class");
    }
}

class B extends A {
    public int b(){
        return 1;
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        //error message : 'A' is abstract; cannot be instantiated
        //A obj = new A();

        B obj = new B();
        obj.d();
    }
}
