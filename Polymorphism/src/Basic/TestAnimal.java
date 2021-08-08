package Basic;
/*
* 多态：
*       同一个对象在不同时刻表现出不同形态
*  例：猫
*       猫可以是 猫 cat = new 猫();
*       也可以是 动物 animal = new 猫();
*
*  多态的前提和体现：
*       有继承/实现关系
*       有方法重写
*       有父类引用指向子类对象
*/
public class TestAnimal {
    public static void main(String[] args) {
        //3.有父类引用指向子类对象
        Animal cat = new Cat();
    }
}
