package MyThread;

public class ImpThread implements Runnable{//①创建一个类继承线程类
    @Override
    public void run(){//②重写接口的run方法
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
