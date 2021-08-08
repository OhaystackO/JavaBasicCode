package SystemCommonAPI;

public class TestSystem {
    public static void main(String[] args) {
        System.out.println("start");
        //终止当前运行的程序
//        System.exit(0);
        System.out.println("end");

        //返回当前事假(以毫秒为单位)
        System.out.println(System.currentTimeMillis());
        //时间的应用：
        //计算举例1970.1.1多少年
        System.out.println(System.currentTimeMillis()*1.0/1000/60/60/24/365+"年");
        long start = System.currentTimeMillis();
        for(int i  =0;i<10000;++i){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-start)+"毫秒");
    }
}
