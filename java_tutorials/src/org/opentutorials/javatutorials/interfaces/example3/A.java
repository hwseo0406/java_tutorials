package org.opentutorials.javatutorials.interfaces.example3;

interface I1 {
    public void m1();
}

interface I2 {
    public void m2();
}

class A implements I1, I2 {
    public void m1() {}
    public void m2() {}
}


//하나의 클래스는 여러개의 인터페이스를 구현할 수 있다.