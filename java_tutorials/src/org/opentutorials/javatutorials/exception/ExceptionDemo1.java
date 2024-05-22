package org.opentutorials.javatutorials.exception;

class A {
    private int[] arr = new int[3];
    A() {
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
        }
    }
}

public class ExceptionDemo1 {
    public static void main(String[] args) {
        A a = new A();
        a.z(1, 0);
    }
}
/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
at org.opentutorials.javatutorials.exception.A.z(ExceptionDemo1.java:11)
at org.opentutorials.javatutorials.exception.ExceptionDemo1.main(ExceptionDemo1.java:18)
 */