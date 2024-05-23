package org.opentutorials.javatutorials.collection;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        String[] arrayObj = new String[2];
        arrayObj[0] = "one";
        arrayObj[1] = "two";
        // arrayObj[2] = "three";
        for(int i=0; i<arrayObj.length; i++){
            System.out.println(arrayObj[i]);
        }

        ArrayList<String> al = new ArrayList<String>(); //generic을 통해 형변환을 해줌
        al.add("one");
        al.add("two");
        al.add("three");
        for(int i=0; i<al.size(); i++){
            String value = al.get(i);                   //여기서 강제형벼환을 할 필요가 없음
            System.out.println(al.get(i));
        }
    }

}