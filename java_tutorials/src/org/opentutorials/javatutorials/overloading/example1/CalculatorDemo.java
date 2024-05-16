package org.opentutorials.javatutorials.overloading.example1;

class Calculator {

    int left, right;
    int third = 0;

    public void setOprands(int left, int right) {
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }

    public void setOprands(int left, int right, int third) {
        //this.setOprands(left, right); //중복되는 부분을 줄이기 위해
        System.out.println("setOprands(int left, int right, int third)");
        this.left = left;
        this.right = right;
        this.third = third;
    }

    public void sum() {
        System.out.println(this.left + this.right + this.third);
    }

    public void avg() {
        System.out.println((this.left + this.right + this.third)/2);
    }



}

public class CalculatorDemo {
    public static void main (String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(2, 4);
        c1.sum();
        c1.avg();
        c1.setOprands(1, 2,3);
        c1.sum();
        c1.avg();
    }
}
