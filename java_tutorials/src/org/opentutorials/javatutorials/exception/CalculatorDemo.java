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
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
             /*
            계산결과는


            e.getMessage()
            / by zero

                e.toString()
                java.lang.ArithmeticException: / by zero


                e.printStackTrace()
                java.lang.ArithmeticException: / by zero
	                at org.opentutorials.javatutorials.exception.Calculator.devide(CalculatorDemo.java:15)
	                at org.opentutorials.javatutorials.exception.CalculatorDemo.main(CalculatorDemo.java:32)
             */

//            //java.lang.ArithmeticException: / by zero 오류발생
//            System.out.println(e.getMessage()  + " 오류발생");
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
