package CreateAndUse;
/*
 * 学生测试类：
 *   使用学生类中的成员属性和成员方法
 */
public class StudentCreateAndUse {
    public static void main(String[] args) {
        StudentClass st = new StudentClass();

        st.age = 18;
        st.name = "小红";

        System.out.println(st.age);
        System.out.println(st.name);

        st.homework();
        st.study();
    }
}
