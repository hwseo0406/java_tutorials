package org.opentutorials.javatutorials.reference;

class A{
    public int id;
    A(int id){
        this.id = id;
    }
}

public class ReferenceDemo1 {

    public static void runValue(){
        int a = 1;
        int b = a; //a라는 상자에 값1을 넣고 b에다가는 a상자 안에 들어있는 값1을 복제해서 넣음
        b = 2;
        System.out.println("runValue, "+a+b);
    }

    public static void runReference(){
        A a = new A(1);
        A b = a;
        b = new A(2);
        System.out.println("runReference, "+a.id);
    }

    public static void main(String[] args) {

        runValue();
        runReference();

    }
}
