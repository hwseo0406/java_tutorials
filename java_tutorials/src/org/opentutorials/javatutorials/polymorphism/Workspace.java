package org.opentutorials.javatutorials.polymorphism;

interface father {}
interface mother {}
interface programmer {
    public void programming();
}
interface beliver{}

class Tori implements father, beliver, programmer {
    public void programming() {
        System.out.println("fast");
    }
}

class Maro implements mother, programmer {
    public void programming() {
        System.out.println("beauty");
    }
}

public class Workspace {
    public static void main(String[] args) {
        programmer employee1 = new Tori();
        programmer employee2 = new Maro();

        employee1.programming();
        employee2.programming();
    }
}
