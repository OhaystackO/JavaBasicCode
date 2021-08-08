package Abstract;

public class Test {
    public static void main(String[] args) {
        AnimalOperater ao = new AnimalOperater();
        Animal a = new Cat();
        ao.useAnimal(a);//等价于多态的形式传递一个Animal对象
        /*
            useAnimal是调用a对象的eat方法
            ao.useAnimal(a) 等价于 a.eat()
            编译看父类Animal，运行看子类a
        */

        Animal a2 = ao.getAnimal();
        /*
            ao.getAnimal()实际上是返回方法体内创建的对象
            ao.getAnimal() 等价于Animal a2 = new Cat();
            多态的形式
        */
        a2.eat();
        //编译看父类执行看子类
    }
}
