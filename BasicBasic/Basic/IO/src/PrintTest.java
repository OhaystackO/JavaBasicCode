/*
* 1.System.out.println(); 输出内容并换行
* 2.System.out.print();输出内容不换行
*/
public class PrintTest {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(666);
        System.out.println(3.14);
        System.out.println('s');
        System.out.println(false);

        System.out.println("-------------");

        System.out.print("hello world");
        System.out.print(666);
        System.out.print(3.14);
        System.out.print('s');
        System.out.print(false);
    }
}
