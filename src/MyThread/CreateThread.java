package MyThread;
/*
    测试线程的三种创建方法
    1.继承Thread
    2.实现Runnable接口
    3.匿名内部类
    测试使用迭代器进行遍历时删除会不会删除所有元素，如果不会，为什么？
*/
public class CreateThread {
    public static void main(String[] args) {
        //3.通过匿名内部类的方式创建线程
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0;i<100;i++){
                    System.out.println(Thread.currentThread().getName()+"-->"+i);
                }
            }
        });
        //③创建线程对象
        Thread t2=new ExtendThread();
        ImpThread t=new ImpThread();
        Thread t3=new Thread(t);//将对象作为参数传入通过有参构造将impThread对象包装为线程对象

        //设置线程名称
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");

        t1.start();
        t2.start();
        t3.start();
    }

}