package StringAbout.Exercise;
import  java.util.Scanner;

/*
* 键盘录入一个字符串，统计该字符串中大写字母，小写字母和数字字符出现的次数
*/
public class CountCharactor {
    public static void main(String[] args) {
        int numCount = 0;
        int CharCount = 0;
        int charCount = 0;
        Scanner sc = new Scanner(System.in);

       /* System.out.println((int)'a' + "," + (int)'A' + "," + (int)20);
        System.out.println('a' + "," + 'A' + "," + '2');*/
        System.out.println("输入字符串:");
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); ++i){
            if(input.charAt(i) >= (int)'A' && input.charAt(i) <= (int)'Z'){//大写字母
                CharCount++;
            }else if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z'){//小写字母
                charCount++;
            }else if(input.charAt(i) >= '0' && input.charAt(i) <= '9'){
                numCount++;
            }//数字
        }
        System.out.println("大写字母" + CharCount + "个\n" + "小写字母" + charCount + "个\n" + "数字" + numCount + "个");
    }
}
