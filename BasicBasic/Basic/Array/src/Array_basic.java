/*
1.数组动态初始化
2.数组元素访问
3.数据静态初始化
4.两个数组指向相同
5.遍历数组格式
*/

public class Array_basic {
    public static void main(String[] args) {
        int[] arr = new int[3];
        //int类型；[]数组；arr数组名；
        //new申请空间；int元素类型；[3]有三个元素的数组
        System.out.println(arr);//输出数组（首元素）地址
        System.out.println(arr[0]);//输出数组索引为0的元素值
        System.out.println("--------");

        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        for (int i = 0;i < arr.length;++i){
            System.out.println(arr[i]);
        }
        System.out.println("--------");

        int[] arr3 = {1,2,3,4};//简化静态初始化给出元素，让系统判断元素个数

        int[] arr2 = arr;//将arr的指向地址复制给arr2实现两个数组指向同一块空间
        arr2[0] = 5;
        arr2[1] = 6;
        arr2[2] = 7;
        for (int i = 0;i < arr2.length;++i){
            System.out.println(arr[i]);
        }
    }
}
