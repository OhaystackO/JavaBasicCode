package CreateAndUse;
/*
 * 创建对象
 *   格式：类名 对象名 = new 类名();
 * 使用对象
 *   对象名.变量名
 *   对象名.方法名
 */
public class PhoneTest {
    public static void main(String[] args) {
        //创建对象
        PhoneClass p = new PhoneClass();

        //使用成员变量
        System.out.println(p.brand);
        System.out.println(p.price);

        p.brand = "huawei";
        p.price = 2000;

        System.out.println(p.brand);
        System.out.println(p.price);

        //使用成员方法
        p.call();
        p.sendMessage();
    }
}
