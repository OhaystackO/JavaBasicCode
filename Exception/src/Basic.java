/*
     JVM默认处理方案：
        输出异常名称，原因，位置等信息
        停止程序
*/
public class Basic {
    public static void main(String[] args) {
        System.out.println("begain");
        method();
        System.out.println("end");
    }

    public static void method(){
        int[] arr = {1,2,3};
        System.out.println(arr[2]);
        System.out.println(arr[3]);//ArrayIndexOutOfBoundsExceptio
    }
}
