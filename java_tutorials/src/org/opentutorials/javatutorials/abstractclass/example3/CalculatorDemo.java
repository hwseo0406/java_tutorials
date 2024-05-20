package org.opentutorials.javatutorials.abstractclass.example3;

abstract class Calculator {

    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    //sum에 있는 this.left+this.right는 이렇게 단축할 수도 있음, 중복되는 부분이기 때문에
    int _sum(){
        return this.left + this.right;
    }

    public abstract void sum();
    public abstract void avg();

    public void run(){
        sum();
        avg();
    }

}

class CalculatorDecoNice extends Calculator {

    public void sum() {
        System.out.println("Nice Sum :" + _sum());
    }
    public void avg() {
        System.out.println("Nice Avg :" + (this.left + this.right)/2);
    }

}

class CalculatorDecoGood extends Calculator {

    public void sum() {
        System.out.println("Good Sum :" + _sum());
    }
    public void avg() {
        System.out.println("Good Avg :" + (this.left + this.right)/2);
    }

}



public class CalculatorDemo {
    public static void main(String[] args) {

        CalculatorDecoNice c1 = new CalculatorDecoNice();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();

        CalculatorDecoGood c2 = new CalculatorDecoGood();
        c2.setOprands(10, 20);
        c2.sum();
        c2.avg();

    }
}
