package org.opentutorials.javatutorials.Inheritance.example3;

class Calculator {
    int left, right;

    //public Calculator() {} // 이 기본 생성자가 없으면 SubtractableCalculator 매소드가 에러남(Calculator)의 기본생성자가 없기 때문

    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }

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
        //하위클래스의 초기화 코드를 여기, super보다 먼저 쓰면 안됨
        super(left, right); // 이 super는 부모클래스를 의미하고 그 부모의 생성자임
//        this.left = left;
//        this.right = right;
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubtractableCalculator c1 = new SubtractableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}