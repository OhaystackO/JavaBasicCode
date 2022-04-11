package Extends;

public class Cat extends Animal implements interfaceY{
    String name;
    int age;
    String hobby;
    String color;

    public Cat() {
    }

    public Cat(String name, int age, String hobby, String color) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.color = color;
    }

    public void eat() {
        System.out.println(name + "eat fish");
    }

    public void cute() {
        System.out.println(name + "it's cute");
    }

    public void speak() {
        System.out.println(name + "speak");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void role() {
        System.out.println(name+" role");
    }
}
