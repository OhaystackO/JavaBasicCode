package StringAbout.Exercise;
import java.util.Scanner;
/*
* 键盘录入一个字符串，使用程序是现在控制台遍历该字符串
*/
public class IterationString {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("输入一个字符串:");
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); ++i){
            System.out.println("第" + i + "个字符是:" + input.charAt(i));
            count++;
        }
        System.out.print("一共" + count + "个字符。");
    }
}
