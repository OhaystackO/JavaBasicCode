package Extends;

public class test {
    public static void main(String[] args) {
        Cat cat1=new Cat("cat1",1,"sun","white");
        Dog dog1=new Dog("dog1");
        Animal an1=new Cat("cat2",2,"flower","white");
        Animal an2=new Dog("dog2");

        System.out.println(cat1);
        System.out.println(an1);
        System.out.println(dog1);
        System.out.println(an2);

        cat1.eat();
        cat1.cute();
        cat1.speak();
        an1.eat();
        an1.sleep();
        an1.speak();
        dog1.eat();
        dog1.play();
        an2.sleep();
        an2.speak();
        an2.eat();
    }
}
