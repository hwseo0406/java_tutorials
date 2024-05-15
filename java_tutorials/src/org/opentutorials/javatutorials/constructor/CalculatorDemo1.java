package org.opentutorials.javatutorials.constructor;

class Calculator {
    int left, right;

    public Calculator(int left, int right) { //생성자, constroctor (class와 이름이 같은 매소드를 만들면 가장 먼저 실행되게 약속됨
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right)/2);
    }
}


public class CalculatorDemo1 {
    public static void main(String[] args) {

        Calculator c1 = new Calculator(10,20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator(20,40);
        c2.sum();
        c2.avg();
    }
}
