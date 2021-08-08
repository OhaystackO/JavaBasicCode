package CreateAndUse;
/*
 * 单个对象和多个对象
 */
public class MutipleObject {
    //单个对象
    public static void main(String[] args) {
        StudentClass s = new StudentClass();
        System.out.println(s);

        System.out.println(s.name + "," + s.age);

        s.name = "zhang";
        s.age = 18;

        System.out.println(s.name + "," + s.age);

        s.study();
        s.homework();
        System.out.println("\n\n");

    //多个对象
        StudentClass s1 = new StudentClass();
        s1.name = "wang";
        s1.age = 30;
        System.out.println(s1.name + "," + s1.age);
        s1.study();;
        s1.homework();

        StudentClass s2 = new StudentClass();
        s2.name  = "zhao";
        s2.age = 20;
        System.out.println(s2.name+ "," + s2.age);
        s2.study();
        s2.homework();
        System.out.println("\n\n");


    //多个对象指向相同内存
        StudentClass s3 = new StudentClass();
        StudentClass s4 = new StudentClass();
        s3.age = 28;
        s3.name = "zhou";
        System.out.println(s3.name + "," + s3.age);
        System.out.println(s4.name + "," + s4.age);

        s4 = s3;
        s4.age = 48;
        s4.name = "wang";

        System.out.println(s3.name + "," + s3.age);
        System.out.println(s4.name + "," + s4.age);
    }
}
