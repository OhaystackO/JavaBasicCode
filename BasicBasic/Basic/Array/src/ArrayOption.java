/*
* 1.获取元素数量
* 2.遍历数组元素
* 3.获取最值
*
*/

public class ArrayOption {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        //数组静态初始化

        for (int i = 0; i < arr.length;/*1.获取数组长度*/ ++i){
            System.out.println(arr[i]);
        }
        //2.遍历数组元素

        int max = arr[0];
        for (int j = 0; j < arr.length; ++j){
            if(arr[j] >= max){
                max = arr[j];
            }
        }
        System.out.println("max:" + max);
        //3.获取最值
    }
}
