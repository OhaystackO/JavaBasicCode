package Exercise2;

public abstract class Sportsman extends Human{
    public Sportsman() {
    }

    public Sportsman(int age, String name) {
        super(age, name);
    }

    public abstract void study();
}
