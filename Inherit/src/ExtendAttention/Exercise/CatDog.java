package ExtendAttention.Exercise;

public class CatDog {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("first");
        c1.setAge(1);

        Cat c2 = new Cat("seconed",1);
        System.out.println(c1.getName()+","+c1.getAge()+"\n"+c2.getName()+","+c2.getAge());
        c1.mouse();
    }
}
