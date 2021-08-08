package ExtendAttention.Exercise;
import java.util.ArrayList;
import java.util.Scanner;
/*
* 创建一个存储学生对象的集合，存储三个学生对象
* 使用程序是现在控制台遍历输出学生信息
* 学生信息通过键盘输入
*/
public class StudentArrayListUpdate {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

        initStudent(st1);
        initStudent(st2);
        initStudent(st3);

        students.add(st1);
        students.add(st2);
        students.add(st3);

        for (int i = 0; i < students.size(); ++i){
            System.out.println("学生"+(i+1)+":姓名"+students.get(i).name+","+students.get(i).age+"岁"+",学号"+students.get(i).ID);
            students.get(i).activity();
            students.get(i).study();
        }
    }

    public static void initStudent(Student st){
        Scanner sc = new Scanner(System.in);
        System.out.print("name:");
        st.name = sc.nextLine();
        System.out.print("ID:");
        st.ID = sc.nextLine();
        System.out.print("age:");
        st.age = sc.nextInt();

    }
}
