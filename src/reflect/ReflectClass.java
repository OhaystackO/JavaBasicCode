package reflect;


import java.lang.reflect.Constructor;


/*
* 2.使用反射实现以下操作：
	Student student = new Student("张三",19,1);   反射创建对象
	sout(student.name);                          访问对象属性
	student.eat();                               调用对象方法
*/
public class ReflectClass {
    public static void main(String[] args) {
        Class stu= null;
        //反射创建对象
        try {
            stu = Class.forName("reflect.Student");//反射获取Student类信息
            Constructor stuCon=stu.getConstructor(int.class,int.class,int.class);//通过反射得到Student类的公开构造方法
            Student stu2=(Student) stuCon.newInstance(9,8,7);//通过反射得到的构造方法创建对象
            //Field ,Method ,Constructor
            //使用反射创建的对象访问属性和调用方法
            System.out.println(stu2);
            System.out.println(stu2.getName());
            stu2.eat();
            stu2.sleep();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
