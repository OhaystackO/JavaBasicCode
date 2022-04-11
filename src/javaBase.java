public class javaBase {
    public static void main(String[] args){
        /*
        * JDK
        * JRE
        * JVM
        */

        //编写一个hello world程序
        System.out.println("hello world!");

        //定义8种基本变量并输出
        int a = 10;
        long b = 1355134202;
        float c = 10;
        double d = 10.0;
        char e = 'a';
        String arr = "hello";
        byte f = 1;
        short g = 10;

        System.out.println("int:"+a+"\nlong:"+b+"\nfloat:"+c+"\ndouble:"+d+"\nchar"+e+"\nString:"+arr+"\nbyte:"+f+"\nshort:"+g);

        System.out.println("\n***********订单列表***********");
        //输出订单表
        System.out.print(
                "编号     商品      单价      数量         日期" +"\n"+
                "01      眼镜      ￥500     1        2020-01-09" +"\n"+
                "02      手机      ￥3000    1        2020-09-12" +"\n"+
                "03      手表      ￥1000    1        2020-10-01" +"\n"+
                "04     电脑       ￥8000    1        2020-10-09");
    }
}
