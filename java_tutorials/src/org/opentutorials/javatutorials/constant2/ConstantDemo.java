package org.opentutorials.javatutorials.constant2;

/*
class Fruit{
    public static final Fruit APPLE = new Fruit();
    public static final Fruit PEACH = new Fruit();
    public static final Fruit BANANA = new Fruit();
}
//밑에 enum이 같은 구조임
*/
enum Fruit{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    public String color;
    public String getColor(){
        return this.color;
    }

    Fruit(String color){
        //상수들의 값들이 세팅될 때마다 Fruit가 인스턴스화 되면서 인스턴스를 만들기 위한 생성자 호출
        System.out.println("Call Constructor" + this);
        this.color = color;
    }
}

/*
class Company{
    public static final Company GOOGLE = new Company();
    public static final Company APPLE = new Company();
    public static final Company ORACLE = new Company();
}
*/

enum Company {
    GOOGLE, APPLE, ORACLE
}

public class ConstantDemo {
    /*
    private final static int FRUIT_APPLE = 1;
    private final static int FRUIT_PEACH = 2;
    private final static int FRUIT_BANANA = 3;

    private final static int COMPANY_GOOGLE = 1;
    private final static int COMPANY_APPLE = 2;
    private final static int COMPANY_ORACLE = 3;

     */

    public static void main(String[] args) {
/*
        if (Fruit.APPLE == Company.APPLE) {
            System.out.println("과일애플과 기업애플은 같다.");
        }

 */

        Fruit type = Fruit.APPLE;
        //switch문은 byte short char int enum 등등 정해져있음
        switch(type){
            case APPLE:
                System.out.println(57 + " kcal, color :" + Fruit.APPLE.getColor());
                break;
            case PEACH:
                System.out.println(24 + " kcal, color :" + Fruit.PEACH.getColor());
                break;
            case BANANA:
                System.out.println(109 + " kcal, color :" + Fruit.BANANA.getColor());
                break;
        }
    }
}
