package Exercise;

public class Catimpl extends Animal implements Jumpping{
    @Override
    public void eat() {
        System.out.println("eat fish");
    }

    @Override
    public void jump() {
        System.out.println("cat jump");
    }

    public Catimpl() {
    }

    public Catimpl(String name, int age) {
        super(name, age);
    }
}
