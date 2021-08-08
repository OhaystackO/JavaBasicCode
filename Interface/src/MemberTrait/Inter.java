package MemberTrait;

public interface Inter {
    public int num = 10;
    public final int num2 = 20;
    /*public static final int num3 = 20;
    所有的变量默认都是这种格式*/

    /*public Inter(){}
    接口没有构造方法，因为接口是一种抽象存在*/

    /*public void show(){}
    接口里的方法不能有非抽象方法*/

    public abstract void method();
    void show();
    //接口中的方法默认带有public abstract
}
