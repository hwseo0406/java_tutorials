package org.opentutorials.javatutorials.scope;
 
public class ScopeDemo {
 
    static void a() {
        int i = 0; //이건 이 메소드 안에서만 유효함
    }
 
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }
 
}