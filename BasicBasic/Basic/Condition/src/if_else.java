import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        System.out.println("input a number:");
        input = sc.nextInt();

        if(input % 2 == 0){
            System.out.println(input + "is an even number.");
        }
        else{
            System.out.println(input + "is an odd number.");
        }
    }
}
