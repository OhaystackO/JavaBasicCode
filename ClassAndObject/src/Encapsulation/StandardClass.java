package Encapsulation;
/*
* 标准类：
*   成员变量使用private修饰
*   手动提供一个无参构造方法与多个有参构造方法
*   对每一个成员变量提供对应的set/get方法
*   提供一个显示对象信息的show()方法
*
* 测试类：
*   无参构造方法创建对象后使用set赋值
*   使用带参数构造方法直接创建带有属性值的对象
*/
public class StandardClass {
    //猫类
    private String color;
    private double height;
    private String name;

    // 构造方法
    public StandardClass(){}
    public StandardClass(String name,String color,double height){
        this.name = name;
        this.color = color;
        this.height = height;
    }

    //set/get方法
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //show方法
    public void show(){
        System.out.println(name + ","+ color + "," + height);
    }
}
