import java.util.Arrays;

/*
    Arrays中包含用于操作数组的各种方法
    public static String toString(int[] a),返回指定数组的字符串表示形式
    public static void sort(int[] a)按照数字顺序排列指定的数组,存入元数组
*/
public class ArraysMethods {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        //toString(int[] arr)
        System.out.println("before:" + Arrays.toString(arr));

        //sort(int[] arr)
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i]+" ");
        }
//        System.out.println("after:"+Arrays.toString(arr));
    }
}
