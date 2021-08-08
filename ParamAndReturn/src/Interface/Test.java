package Interface;

public class Test {
    public static void main(String[] args) {
        JumppingOperater jo = new JumppingOperater();
        Jumpping j = new Jumppingimpl();
        jo.useJumpping(j);
        /*
             等价于useJumpping(new Jumppingimpl())
             以多态的形式创建一个Jumping接口实现类的对象
             useJumpping的方法体通过j调用了接口中的jump方法
             等价于:
                Jumpping j = new Jumppingimpl();
                j.jump();
        */

        Jumpping j2 = jo.getJumpping();
        /*
            getJumpping返回的是一个Jumpping接口实现类的对象(多态)
            等价于：
                Jumpping j2 = new Jumppingimpl();
        */

        j2.jump();
    }
}
