package Exercise2;

public class BaskateballPlayer extends Sportsman{
    public BaskateballPlayer() {
    }

    public BaskateballPlayer(int age, String name) {
        super(age, name);
    }

    @Override
    public void study() {
        System.out.println("study basketball");
    }

    @Override
    public void eat() {
        System.out.println("basketball player eat");
    }
}
