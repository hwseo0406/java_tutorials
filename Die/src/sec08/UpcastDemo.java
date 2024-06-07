package sec08;

public class UpcastDemo {

    public static void main(String[] args) {

        Person p;
        Student s = new Student();
        Student s1;

        //가능함 이게 업캐스트임 업캐스트는 자식>부모 방향으로만 가능
        p = s;
        s1 = (Student) p;

        //여기서 자식클래스에 있는 work()는 안보임
        p.whoami();

        s1.work();
    }
}
