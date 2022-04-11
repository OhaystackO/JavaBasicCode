package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ball {
    /*双色球
        6个红色球（1-33）
        1个蓝色球（1-6）
    */
    public static void main(String[] args){
        List<Integer> nums=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入球号：");
        for(int i=0;i<6;i++){
            System.out.print("红:");
            nums.add((Integer)sc.nextInt());
        }
        System.out.print("蓝：");
        nums.add((Integer)sc.nextInt());
        System.out.println(nums);
    }
}
