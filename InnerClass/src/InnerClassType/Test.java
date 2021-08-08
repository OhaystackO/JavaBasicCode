package InnerClassType;
/*
    外界如何创建成员内部类的对象：
    格式：外部类名.内部类名 对象名 = 外部类对象.内部类对象
    理解：   限定内部类
    示例：   Outer.Inner     oi = new Outer().new Inner();
*/
public class Test {
    public static void main(String[] args) {

        /* Outer.Inner oi = new Outer().new Inner();
        oi.show();*/

        //通过外部类对象访问外部类中的method方法间接访问内部类中的show方法
       Outer o = new Outer();
       o.method();
    }
}
