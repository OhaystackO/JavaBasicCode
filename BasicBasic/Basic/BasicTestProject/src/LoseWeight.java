/*
* 减肥：
* 输入星期数，返回当天的减肥计划
* 1.跑步
* 2.游泳
* 3.慢走
* 4.动感单车
* 5.拳击
* 6.爬山
* 7.好好吃一顿
*/
import java.util.Scanner;

public class LoseWeight {
    public static void main(String[] args) {
        exercise();
    }

    public static void exercise(){
        Scanner input = new Scanner(System.in);
        System.out.print("输入星期数查看训练项目：");
        int weekNum = input.nextInt();

        switch (weekNum){
            case 1:
                System.out.println("训练项目：跑步");
                break;
            case 2:
                System.out.println("训练项目：游泳");
                break;
            case 3:
                System.out.println("训练项目：慢走");
                break;
            case 4:
                System.out.println("训练项目：动感单车");
                break;
            case 5:
                System.out.println("训练项目：拳击");
                break;
            case 6:
                System.out.println("训练项目：爬山");
                break;
            case 7:
                System.out.println("训练项目：好好吃一顿");
                break;
            default:
                System.out.println("不合法输入");
                break;
        }
    }
}
