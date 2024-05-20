package org.opentutorials.javatutorials.interfaces.example3;

interface I3 {
    public void m3();
}

interface I4 extends I3 {
    public void m4();
}

public class B implements I4 {
    public void m3() {}
    public void m4() {}
}
