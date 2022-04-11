package Extends;

public class Dog extends Animal implements interfaceX{
    String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(this.name+"eat meat");
    }
    public void play(){
        System.out.println(this.name+"play toy");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void fight() {
        System.out.println(name+" fight");
    }
}
