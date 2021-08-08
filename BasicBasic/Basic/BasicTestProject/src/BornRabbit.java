/*
* 需求：
*   有一对兔子，出生后的第三个月开始每个月生一对兔子，
*   小兔子长到第三个月后每个月又生一对兔子，
*   假如兔子不会死，第20个月有几对兔子
*
*/
public class BornRabbit {
    public static void main(String[] args) {
        int[] num = new int[20];
        int nums = rabbitNum(num);

        System.out.println("第20个月有" + nums + "对兔子");
    }

    public static int rabbitNum(int[] arr){
        arr[0] = arr[1] = 1;
        for(int i = 2; i < arr.length; ++i){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[19];
    }
}
