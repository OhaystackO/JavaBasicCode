package Basic;
/*
    内部类格式：
        public class 类名{
            修饰符 class 类名{
            }
        }
    内部类访问特点：
        内部类可以直接访问外部类的成员，包括私有
        外部类要访问内部类的成员必须创建对象
*/
public class Outer {
    private int num = 10;

    public class Inner{
        public void show(){
            System.out.println(num);//内部类能直接访问外部类成员
        }
    }

    public void method(){
        Inner i = new Inner();//创建内部类的对象
        i.show();//通过内部类的对象访问自身的东西
    }
}
