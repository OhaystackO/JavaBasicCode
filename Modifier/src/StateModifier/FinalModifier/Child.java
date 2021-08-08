package StateModifier.FinalModifier;
/*
* final修饰的特点：
*   1.final修饰的变量是常量，不能被再次赋值
*   2.final修饰的方法是最终方法，不能被重写
*   3.final修饰的类是最终类，不能被继承
* final修饰局部变量:
*   1.final修饰基本类型变量时变量不能再次被赋值
*   2.final修饰引用类型变量时，变量的地址不能变，但是原地址中的基本类型值可变
*/
public class Child/* extends Father*/{
    //被final修饰的类不能被继承
    public int time = 0;
    public final int age = 20;
    public void show(){
        /*age = 100;final修饰的变量是常量*/
        System.out.println(age);
    }
    /*@Override
    public void method(){
        System.out.println("father method");
    }
    //final修饰的方法不能重写
    */

    public static void main(String[] args) {
        final int age = 20;
        //final修饰基本类型变量时变量不能再次被赋值

        final Child c = new Child();
        //final修饰引用类型变量时，变量的地址不能变，但是原地址中的基本类型值可变
        c.time = 20;
        /*c = new Child(); 试图修改引用类型的地址值会报错*/
    }
}
