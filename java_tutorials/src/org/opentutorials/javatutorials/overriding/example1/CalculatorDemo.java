package org.opentutorials.javatutorials.overriding.example1;

class Calculator {
    int left, right;

    public void setOprand(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public int avg() {
        return((this.left + this.right)/2);
    }
}

class SubtractableCalculator extends Calculator {

    public void sum() {
        System.out.println("두 수를 더하면 " + (this.left + this.right) + "입니다.");
    }

    public void subtract() {
        System.out.println(this.left - this.right);
    }

    public int avg() {
        return super.avg(); // 부모클래스에서 리턴값을 받고싶다면 super을 사용할 수 있음
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        SubtractableCalculator c1 = new SubtractableCalculator(); // 여기에는 상속받은 메소드 이름을 써줘야됨!!!!
        c1.setOprand(20,30);
        c1.sum();
        c1.subtract();
    }
}
