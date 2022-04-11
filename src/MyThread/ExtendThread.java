package MyThread;

public class ExtendThread extends Thread{
    @Override
    public void run(){//②重写线程类的run方法
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
