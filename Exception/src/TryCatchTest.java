/*
    try{
        可能出现异常的代码：
    }catch(异常类名 变量名){
    异常的处理代码}
*/

public class TryCatchTest {
    public static void main(String[] args) {
        System.out.println("begain");
        method();
        System.out.println("end");
    }

    public static void method(){
        try{
            int[] arr= {1,2,3};
            System.out.println(arr[3]);//产生错误的地方会执行new操作
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        }

    }
}
