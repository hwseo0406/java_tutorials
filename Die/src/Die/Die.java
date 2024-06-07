package Die;

import java.util.Random;

class Die {

    private int number;
//    String name;
    static int noOfDie = 0;

    Die() {
        noOfDie++;
    }

//    Die(String name) {
//        this();
//        this.name = name + noOfDie;
//    }


    int getNumber() {
        return number;
    }

    void setNumber(int number) {
        this.number = number;
    }

    int SIDES = 6;

    void roll() {

        Random r = new Random();
        int no = r.nextInt(SIDES);
        this.setNumber(no+1);

    }

//    boolean isSame(Die yours) {
//        return this.number == yours.number;
//    }

}