package Class;

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        CatOperator co = new CatOperator();

        co.useCat(c);

        Cat c2 = co.getCat();//等价于new Cat();
        c2.eat();
    }
}
