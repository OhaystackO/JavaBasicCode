import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    Java中的异常被分为两大类：
        所有 RuntimeException类及其子类的实例被称为 运行时异常 ，又称非受检异常
        其他的类被称为 编译时异常
    异常处理方法：
        编译时异常必须显示处理，否则程序无法通过编译
        运行时异常无需显示处理，也可以和编译时异常一样处理
*/
public class ExceptionTypes {
    public static void main(String[] args) {

    }
    //编译时异常
    public static void method2(){
        try{
            String s = "s048-08-09";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(s);
            System.out.println(d);
        }catch(ParseException p){
            p.printStackTrace();
        }

    }

    //运行时异常
    public static void method(){
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
