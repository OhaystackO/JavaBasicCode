import  java.util.Scanner;
public class CirculateType {
    public static void main(String[] args) {
        System.out.println("--------for--------");
        for(int i = 0;i< 5 ;++i){
            System.out.println("hello world!");
        }
        System.out.println("------------------");

        int units,tens,hundreds;
        int result = 1;
        int count = 0;
        for(int i = 0;i<1000;++i){
          units = (i/1) % 10;
          tens = (i/10) % 10;
          hundreds = (i/100) % 10;
          result = (units*units) + (tens*tens) +(hundreds*hundreds);

          if(result == i)
          {
              System.out.println(i+" ");
              count++;
          }
        }
        System.out.println("count = " + count);

        System.out.println("--------while--------");
        int j = 0;
        while(j < 5){
            System.out.println("hello world!");
            j++;
        }

        double height = 0.1;
        int k = 1;
        while(height <= 8844430){
            height *= 2;
            k++;
        }
        System.out.println("--------do-while-------");
        int m = 0;
        do{
            System.out.println("hello world!");
            m++;
        }while(m<5);
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);
        int password = sc.nextInt();
        int input;

        do{
            System.out.println("input password:");
            input = sc.nextInt();
        }while(input != password);
        System.out.println("Welcome!");
    }
}
