package ExtendAttention.Exercise;

public class TeacherStudent {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("haystack");
        t1.setAge(25);
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("name", 30);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();

        Student s1 = new Student();
        s1.setName("hello");
        s1.setAge(12);
        System.out.println(s1.getName() + "," + s1.getAge());
        s1.study();

        Student s2 = new Student("world",15);
        System.out.println(s2.getName()+ ","+s2.getAge());
        s2.study();
    }
}
