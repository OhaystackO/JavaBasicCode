package MemberTrait;
/*
* 借口成员特点：
*       变量只能是常量，默认修饰符public static final
*       接口没有构造方法
*       成员犯法只能是抽象方法，默认修饰符public abstract
*/
public class Test {
    public static void main(String[] args) {
        Inter i  = new Interimpl();
        /*i.num = 10;
        接口中的变量默认是final修饰的*/
        System.out.println(i.num);
        System.out.println(i.num2);
        System.out.println(Inter.num);
        //接口中的变量默认被static修饰,可通过接口名直接修饰
    }
}
