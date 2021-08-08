package Basic;
/*
* 继承自抽象类的类要重写抽象类中的抽象方法
*/
public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("eat fish");
    }
}
