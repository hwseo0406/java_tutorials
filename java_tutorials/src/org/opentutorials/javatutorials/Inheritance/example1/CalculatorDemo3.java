package org.opentutorials.javatutorials.Inheritance.example1;

class DivisionableCalculator extends MultiplicationbleCalculator {
    public void division() {
        System.out.println(this.left / this.right);
    }
}

public class CalculatorDemo3 {
    public static void main(String[] args) {
        DivisionableCalculator c1 = new DivisionableCalculator();
        c1.setOprands(30,10);
        c1.sum();
        c1.avg();
        c1.multiplication();
        c1.division();
    }
}
