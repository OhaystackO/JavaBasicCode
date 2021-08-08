package ExtendAttention.Exercise;

public class Teacher extends Human {
    public Teacher(){}

    public Teacher(String name, int age) {
        super(name, age);
        //通过super方法调用父类带参构造方法，为继承来的成员变量赋值
    }

    public void teach() {
        System.out.println("教书育人");
    }
}
