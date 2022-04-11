import java.util.Scanner;

public class java02 {
    public static void main(String[] args){
        //求1-100的和
        int sum=0;
        for(int i=0;i<100;++i){
            sum++;
        }
        System.out.println("sum:"+sum);
        System.out.println("--------------");

        //求100-999之间的水仙花数
        int one,ten,hundred;
        for(int i=100;i<1000;++i) {
            one = i % 10;
            ten = (i % 100) / 10;
            hundred = i / 100;
            if (((one * one * one) + (ten * ten * ten) + (hundred * hundred * hundred) == i)) {
                System.out.println(i);
            }
        }
        System.out.println("------------");


        //打印一个三角形
        for(int i=0;i<5;++i){
            for(int j=0;j<i;++j){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------");


        //接收成绩>80优秀，>70<80良好，>60<70及格，<60不及格
        Scanner sc = new Scanner(System.in);
        System.out.print("输入成绩:");
        int in=sc.nextInt();
        if(in<0){
            System.out.println("输入不合法");
        }else{
            if(in>=80){
                System.out.println("优秀");
            }else if(in>70&&in<80){
                System.out.println("良好");
            }else if(in>60&&in<70){
                System.out.println("及格");
            }else{
                System.out.println("不及格");
            }
        }
        System.out.println("------------");


        //判断闰年
        int year=3000;
        do{
            System.out.print("输入一个年份(输入0退出)：");
            year=sc.nextInt();
            if(((year%4==0&&year%100!=0)||year%400==0)&&year!=0){
                System.out.println("闰年");
            }else if(year==0){
                System.out.println("-------------");
            }else{
                System.out.println("平年");
            }
        }while (year!=0);


    }
}
