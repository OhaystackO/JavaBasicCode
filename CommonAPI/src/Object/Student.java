package Object;
/*
    建议所有子类重写Object类的toString方法
    自动生成Alt+Insert->toString
    Object。equals默认比较地址，重写Object类的equals方法比较内容
    自动生成Alt+Insert->equalsAndHashCode
*/
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //判断是否是一个对象
        if (this == o) return true;
        //判断两个对象是否来自一个类
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        //比较年龄
        if (age != student.age) return false;
        //比较姓名,name.equals(student.name)用的是String类的equals方法，String类的equals方法是比较内容
        return name != null ? name.equals(student.name) : student.name == null;
    }
}

