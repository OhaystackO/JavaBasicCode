package StringAbout.Exercise;
import java.util.Scanner;
/*
* 定义一个方法，实现字符串的反转，键盘录入一个字符串，调用该方法后，在控制台输出结果
* 例如:键盘输入abc，输出结果cba
*/
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入字符串:");
        String input = sc.nextLine();

        String result = Reverse(input);
        System.out.print(result);
    }

    public static String Reverse(String input){
        String result = "";
        for(int i = input.length()-1 ; i >= 0; --i) {
            result += input.charAt(i);
        }
        return result;
    }
}
