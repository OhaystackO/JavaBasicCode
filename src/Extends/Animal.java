package Extends;

public abstract class Animal {
     private String name;
     private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak(){
        System.out.println(this.name+"speak");
    }
    public abstract void eat();
    public void sleep(){
        System.out.println(this.name+"sleep");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
