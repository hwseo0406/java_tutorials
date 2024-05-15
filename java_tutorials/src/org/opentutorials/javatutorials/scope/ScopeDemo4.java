package org.opentutorials.javatutorials.scope;

public class ScopeDemo4 {

    //static String title = "Let`s coding!";

    static void a(){
        String title = "Let`s coding!";
    }

    public static void main(String[] args) {
        a();
        //System.out.println(title);
    }
}
