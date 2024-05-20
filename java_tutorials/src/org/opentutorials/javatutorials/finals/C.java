package org.opentutorials.javatutorials.finals;

//final은 메소드, 클래스 둘 다 가능
class A {
    final void b() {}
}

class B extends A {
    //final void b() {}
}

final class C {
    final void b(){}
}
//class D extends C { }
