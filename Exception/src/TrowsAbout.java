import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TrowsAbout {
    public static void main(String[] args) {
        System.out.println("begain");

        //通过throw直接将异常抛出，谁用谁处理，出现异常的位置不会每次都进行处理
        try {
            method2();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("end");
    }
    //编译时异常
    public static void method2() throws ParseException {
            String s = "s048-08-09";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(s);
            System.out.println(d);
    }

    //运行时异常
    public static void method() throws ArrayIndexOutOfBoundsException{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
        }
}
