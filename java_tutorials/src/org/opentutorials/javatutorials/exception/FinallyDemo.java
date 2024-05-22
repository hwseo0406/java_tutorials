package org.opentutorials.javatutorials.exception;

class BF {
    private int[] arr = new int[3];
    BF() {
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 20;
    }
    public void z(int first, int second) {
        //System.out.println(arr[first] + arr[second]);
        try {
            System.out.println(arr[first] / arr[second]);
        }catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
    }
}

public class FinallyDemo {
    public static void main(String[] args) {
        BF b = new BF();
        b.z(10, 0); //Array...
        b.z(1,0);   //Arith....
        b.z(2,1);
    }
}
/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
at org.opentutorials.javatutorials.exception.A.z(ExceptionDemo1.java:11)
at org.opentutorials.javatutorials.exception.ExceptionDemo1.main(ExceptionDemo1.java:18)
 */
