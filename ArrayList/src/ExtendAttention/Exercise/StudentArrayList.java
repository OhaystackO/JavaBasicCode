package ExtendAttention.Exercise;

import java.util.ArrayList;

/*
 * 创建一个存储学生对象的集合，存储3个学生对象
 * 使用程序实现在控制台遍历该集合
 */
public class StudentArrayList {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<Student>();

        Student st1 = new Student("zhao", 18, "201829567");
        Student st2 = new Student("qian", 20, "201634672");
        Student st3 = new Student("sun", 17, "2017683942");

        student.add(st1);
        student.add(st2);
        student.add(st3);

        for (int i = 0; i < student.size(); ++i){
            System.out.println("学生"+(i+1)+":姓名"+student.get(i).name+","+student.get(i).age+"岁"+",学号"+student.get(i).ID);
        }
    }
}

