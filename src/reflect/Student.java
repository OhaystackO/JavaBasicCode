package reflect;

import java.io.Serializable;

/*
1.新建Student实体类：
	-name:int
	-age:int
	-gender:int
	+eat()
	+sleep()
	封装属性，getter,setter,无参，全参构造
*/
public class Student implements Serializable {
    private int name;
    private int age;
    private int gender;

    public void eat(){
        System.out.println(name+" eat");
    }
    public void sleep(){
        System.out.println(name+" sleep");
    }

    public Student() {
    }
    public Student(int name, int age, int gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public int getName() {
        return name;
    }
    public void setName(int name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getGender() {
        return gender;
    }
    public void setGender(int gender) {
        this.gender = gender;
    }
}
