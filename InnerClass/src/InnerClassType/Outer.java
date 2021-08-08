package InnerClassType;
/*
    内部类分两种：
        成员内部类(在成员位置)
        局部内部类(在方法内)
*/
public class Outer {
    private int num =10;

    //成员内部类
    /*public class Inner{
        public void show(){
            System.out.println(num);
        }
    }*/

    //常用格式使用private可以隐藏内部类的内容，外界无法访问
    private class Inner{
        public void show(){
            System.out.println(num);
        }
    }

    //通过外部类对象调用method间接调用Inner对象的show方法
    public void method(){
        Inner i = new Inner();
        i.show();
    }
}
