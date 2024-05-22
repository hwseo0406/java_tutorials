package org.opentutorials.javatutorials.exception;

class DivideException extends Exception {
    public int left, right;

    DivideException(){
        super();
    }
    DivideException(String message){
        super(message);
    }

    DivideException(String message, int left, int right){
        super(message);
        this.left = left;
        this.right = right;
    }
}
class CalculatorE{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide() throws DivideException{
        if(this.right == 0){
            throw new DivideException("0으로 나누는 것은 허용되지 않습니다.", this.left, this.right);
        }
        System.out.print(this.left/this.right);
    }
}
public class CalculatorDemoE {
    public static void main(String[] args) {
        CalculatorE c1 = new CalculatorE();
        c1.setOprands(10, 0);
        try {
            c1.divide();
        } catch (DivideException e) {
            e.printStackTrace();
        }
    }
}