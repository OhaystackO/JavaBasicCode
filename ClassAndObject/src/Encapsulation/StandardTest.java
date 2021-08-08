package Encapsulation;

public class StandardTest {
    public static void main(String[] args) {
        //set赋值
        StandardClass cat1 = new StandardClass();
        cat1.setColor("橘白");
        cat1.setHeight(35.5);
        cat1.setName("大壮");
        cat1.show();

        //构造函数赋值
        StandardClass cat2 = new StandardClass("二壮","橘猫",45.5);
        cat2.show();
    }
}
