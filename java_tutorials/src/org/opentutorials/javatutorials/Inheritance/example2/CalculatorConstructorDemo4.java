package org.opentutorials.javatutorials.Inheritance.example2;

class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubtractableCalculator extends Calculator {
    public SubtractableCalculator(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorConstructorDemo4 {
    public static void main(String[] args) {
        SubtractableCalculator c1 = new SubtractableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}