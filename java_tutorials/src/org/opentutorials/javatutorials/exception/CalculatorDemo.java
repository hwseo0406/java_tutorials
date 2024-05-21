package org.opentutorials.javatutorials.exception;

class Calculator {

    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    void devide() {
        try {
            System.out.println("계산결과는 ");
            System.out.println(this.left / this.right + "입니다.");
        }catch(Exception e) {
            //java.lang.ArithmeticException: / by zero 오류발생
            System.out.println(e.getMessage()  + " 오류발생");
        }
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOprands(10, 0);
        calculator.devide();
    }
}
