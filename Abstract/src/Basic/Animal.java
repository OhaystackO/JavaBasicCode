package Basic;
/*
* 抽象类特点：
    * 1.抽象类和抽象方法都必须使用abstract关键字
    * 2.如果类中有抽象方法，则该类一定是抽象类，但抽象类中可以存在具体方法
    * 3.抽象类不能直接实例化，但可以参照多态的形式，通过子类进行实例化
    * 4.子类要么重写抽象类的抽象方法，要么子类也是抽象类
*/
public abstract class Animal {
    public abstract void eat();

    public void sleep(){
        System.out.println("sleep");
    }
}
