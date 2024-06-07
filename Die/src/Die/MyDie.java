package Die;

public class MyDie {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            OddDie d3 = new OddDie();
            d3.roll();
            System.out.println("홀D3" + ":" + d3.getNumber());

            EvenDie d4 = new EvenDie();
            d4.roll();
            System.out.println("짝D4" + ":" + d4.getNumber());
        }
    }
}
