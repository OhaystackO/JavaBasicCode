package Exercise;

public class Dogimpl extends Animal implements Jumpping{
    @Override
    public void eat() {
        System.out.println("eat bone");
    }

    @Override
    public void jump() {
        System.out.println("dog jump");
    }

    public Dogimpl() {
    }

    public Dogimpl(String name, int age) {
        super(name, age);
    }
}
