import java.util.Scanner;
public class SwitchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input a number(1-7):");
        int week = sc.nextInt();

        switch (week){
            case 1:
                System.out.println("一");break;
            case 2:
                System.out.println("二");break;
            case 3:
                System.out.println("一");break;
            case 4:
                System.out.println("二");break;
            case 5:
                System.out.println("一");break;
            case 6:
                System.out.println("二");break;
            case 7:
                System.out.println("一");break;
                default:
                    System.out.println("输入不合法");
        }
    }
}
