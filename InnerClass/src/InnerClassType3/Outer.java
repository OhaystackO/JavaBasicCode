package InnerClassType3;
/*
    匿名内部类：
        前提:存在一个类(具体类或抽象类)或者接口
        格式:new 类名或接口名(){
                 重写方法；
             };
        本质:匿名内部类是继承了该类或实现了该接口的子类的匿名对象
             匿名内部类是局部内部类的一种格式
*/
public class Outer {
    public void method(){
        //匿名内部类，局部内部类的一种
        new Inter(){
            @Override
            public void show() {
                System.out.println("anonymity");
            }
        }.show();
        //实际上是一个没有名字的对象
        //直接在后面跟方法名就可以进行方法调用
        new Inter(){
            @Override
            public void show() {
                System.out.println("anonymity");
            }
        }.show();
        //第二次调用

        //如果想多次调用，则可以用一个相同类型的变量接收返回值
        Inter i = new Inter(){
            //匿名内部类的格式相当于省略了Inter i多态的形式
            @Override
            public void show() {
                System.out.println("anonymity");
            }
        };
        i.show();
        i.show();
    }
}
