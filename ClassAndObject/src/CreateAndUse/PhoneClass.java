package CreateAndUse;
/*
 * 类的定义步骤：
 *   定义类 public class 类名{成员变量+成员方法}
 *
 * 需求：
 *   手机类：
 *       属性：品牌，价格
 *       行为：电话，短信
 */

public class PhoneClass {
    //成员变量
    String brand;
    int price;

    //成员方法
    public void call(){
        System.out.println("拨出电话");
    }
    public void sendMessage(){
        System.out.println("发送短信");
    }
}
