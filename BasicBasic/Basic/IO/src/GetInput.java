/*
* 接收键盘输入：
* 1.导包
* 2.创建对象
* 3.接收数据
*/
import  java.util.Scanner;
public class GetInput {
    public static void main(String[] args) {
        System.out.println("输入一个数字：");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("输入了："+x);
    }
}
