package Basic;

public class Test {
    public static void main(String[] args) {
        /*Jupping j = new Jupping();
        3.接口是对行为的抽象化,所以不能直接实例化,用实现类对象进行实例化,接口多态*/

        Jupping j  = new Cat();
        j.jump();
    }
}
