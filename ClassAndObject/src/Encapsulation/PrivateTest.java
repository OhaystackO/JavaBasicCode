package Encapsulation;

public class PrivateTest {
    public static void main(String[] args) {
        Private p = new Private();

        System.out.println(p.getTestnum());
        System.out.println(p.teststring + "\n");

        p.setTestnum(5);
        p.teststring = "hello";

        System.out.println(p.getTestnum());
        System.out.println(p.teststring);
        p.test();
    }
}
