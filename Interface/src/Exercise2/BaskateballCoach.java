package Exercise2;

public class BaskateballCoach extends Coach{
    public BaskateballCoach(int age, String name) {
        super(age, name);
    }

    public BaskateballCoach() {
    }

    @Override
    public void teach() {
        System.out.println("teach baskateball");
    }

    @Override
    public void eat() {
        System.out.println("baskateball coach eat");
    }
}
