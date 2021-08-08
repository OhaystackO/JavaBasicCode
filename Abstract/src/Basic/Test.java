package Basic;
/*
* 抽象类创建对象采用多态形式，即，父类引用指向子类对象
*/
public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.eat();//Animal中抽象，子类中重写
        cat.sleep();//Cat继承Animal的sleep方法
    }
}
