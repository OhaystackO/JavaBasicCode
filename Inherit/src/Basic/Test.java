package Basic;

public class Test {
    public static void main(String[] args) {
        Father f = new Father();
        f.show();

        Child c = new Child();
        //因为子类会使用父类的成员变量或方法，所以创建子类对象时，会先访问父类构造方法，初始化父类对象
        c.method();
        c.show();
        //当父类中的成员方法和子类中的成员方法重名时，优先调用子类的成员方法同样可以通过this和super关键字进行指定
    }
}
