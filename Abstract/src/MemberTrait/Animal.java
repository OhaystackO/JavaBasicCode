package MemberTrait;
/*
* 抽象类成员特点：
*       抽象类可以有成员变量，可以是变量也可以是常量
*       抽象类可以有构造方法但不能直接实例化，要用多态的形式实例化
*       可以有成员方法，可以是抽象方法也可以是非抽象方法(提高代码复用性)
*/
public abstract class Animal {
    private int age = 20;
    private final String str = "hello";

    public Animal() {
    }
    public Animal (int num){
        this.age = age;
    }

    public void show() {
        age = 40;
        System.out.println(age);
        System.out.println(str);
    }

    public abstract void eat();
}
