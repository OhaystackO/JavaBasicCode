package InnerClassType2;
/*
    局部内部类：定义在成员方法内部的内部类
    局部内部类外界无法访问，需要在方法内部创建对象使用
    局部内部类可以直接访问外部类的成员，也可以访问方法内的局部变量
*/
public class Outer {
    private int num =10;
    public void method(){
        int num2 = 20;
        //局部内部类
        class Inner{
            public void show(){
                System.out.println(num);
                System.out.println(num2);
            }
        }
        Inner i = new Inner();
        i.show();
    }
}
