package StateModifier.StaticModifier;
/*
* Static修饰特点：
*   1.非静态成员方法可以访问所有静态与非静态成员
*   2.静态的成员方法只能访问静态的成员
*/
public class StaticTest {
    //非静态成员变量
    private  String name = "haystack";
    //静态成员变量
    private static String school = "university";

    //非静态成员方法
    public void show(){}
    public void show2(){
        System.out.println(name);
        System.out.println(school);
        show();
        show3();
    }

    //静态成员方法
    public static void show3(){}
    public static void show4(){
//        System.out.println(name);
        System.out.println(school);
//        show();
        show3();
    }
}
