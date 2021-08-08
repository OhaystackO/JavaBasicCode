package Encapsulation;

import CreateAndUse.StudentClass;

/*
* 构造方法：
*       用于创建对象，完成对象数据的初始化
*       格式：修饰符 类名（参数）{}
*/
public class ConstructionMethod {
    private String name;
    private int age;

    public ConstructionMethod(String name){
        this.name = name;
    }

    public ConstructionMethod(String name,int age){
        this.name = name;
        this.age = age;
    }
    //已经给出一个有参构造方法的情况下，系统不再默认给出无参构造方法，如果还想使用无参构造方法则要主动给出
    public ConstructionMethod(){}

    public void show(){
        System.out.println(name + "," + age);
    }
}