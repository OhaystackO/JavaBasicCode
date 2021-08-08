package StateModifier.StaticModifier;

public class Test {
    public static void main(String[] args) {
        Student.school = "university";
        Student s1 = new Student();
        s1.name = "name";
        s1.age = 20;
        //s1.school = "university";
        //静态修饰的成员不建议通过对象调用,建议通过类直接调用
        s1.show();

        Student s2 = new Student();
        s2.name = "name1";
        s2.age = 30;
        //s2.school = "university";
        //因为Student类中的school变量由static修饰所以只用赋值一次就可以让所有对象共享
        s2.show();
    }
}
