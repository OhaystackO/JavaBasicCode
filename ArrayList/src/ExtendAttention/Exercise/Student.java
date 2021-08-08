package ExtendAttention.Exercise;
/*
* 学生对象:
* 属性：姓名 年龄 学号
* 方法：学习，活动
*/
public class Student {
    String name;
    int age;
    String ID;

    public Student(){}
    public Student(String name,int age,String ID){
        this.age = age;
        this.name = name;
        this.ID = ID;
    }

    public void study(){
        System.out.println("好好学习天天向上");
    }
    public void activity(){
        System.out.println("劳逸结合");
    }
}
