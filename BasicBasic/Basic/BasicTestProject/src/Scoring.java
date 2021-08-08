/*
* 需求：
*   共有六个评委打分，分数为1-100的整数
*   选手最后得分为：去掉最高最低分的四个分数的平均值
*/
import java.util.Scanner;
public class Scoring {
    public static void main(String[] args) {
        int result = scoring();

        System.out.println(result);
    }

    public static int scoring(){
        int[] score = new int[6];
        int sum = 0;

        Scanner scoring = new Scanner(System.in);
        for(int i = 0; i < score.length; ++i){
            System.out.println("请打分");
            score[i] = scoring.nextInt();
        }

        int max = score[0];
        int min = score[0];
        for(int i = 0; i < score.length; ++i){
            sum += score[i];
            if(max < score[i]){max = score[i];}
            if(min > score[i]){min = score[i];}
        }

        int result = (sum-max-min)/4;

        return result;
    }
}
