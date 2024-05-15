package org.opentutorials.javatutorials.Inheritance.example1;

class MultiplicationbleCalculator extends Calculator {
    public void multiplication() {
        System.out.println(this.left * this.right);
    }
}

public class CalculatorDemo2 {
    public static void main(String[] args) {
        MultiplicationbleCalculator c1 = new MultiplicationbleCalculator();
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();
        c1.multiplication();
    }
}
