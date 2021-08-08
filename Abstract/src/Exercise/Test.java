package Exercise;

public class Test {
    public static void main(String[] args) {
        Animal cat1 = new Cat();
        Cat cat2 = new Cat(2,"second");
        cat1.setAge(1);
        cat1.setName("first");

        Animal dog1 = new Dog(1,"third");
        Dog dog2 = new Dog();
        dog2.setAge(1);
        dog2.setName("forth");

        System.out.println(cat1.getName()+","+cat1.getAge());
        System.out.println(cat2.getName()+","+cat2.getAge());
        cat1.eat();

        System.out.println(dog1.getName()+","+dog1.getAge());
        System.out.println(dog2.getName()+","+dog2.getAge());
        dog1.eat();
    }
}
