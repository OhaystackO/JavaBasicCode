/*
* 需求：
*   已知一个数组arr={19,28,37,46,50}
*   键盘录入一个数据
*   查询该数据在数组中的索引
*/

import java.util.Scanner;
public class CompareAndFind {

    public static void main(String[] args) {
        int[] arr = {19,28,37,46,50};
        int i = findIndex(arr);

        if(i == -1){
            System.out.println("数组中没有这个数据");
        }else{
            System.out.println(i);
        }
    }

    public static int findIndex(int[] arr){
        int index = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个数字：");
        int num = input.nextInt();

        for(int i = 0; i < arr.length; ++i){
            if(arr[i] == num){
                index = i;
            }
        }
        return index;
    }
}
