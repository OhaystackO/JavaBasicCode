package Exercise2;

public abstract class Coach extends Human{
    public Coach(int age, String name) {
        super(age, name);
    }

    public Coach() {
        super();
    }

    public abstract void teach();
}
