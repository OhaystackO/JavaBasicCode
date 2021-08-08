package Encapsulation;

/*
 * 编写一个标准类
 * 把成员变量用private修饰
 * 提供对应的get/set方法
 */
public class Private {
    private int testnum;
    String teststring;

    public int getTestnum() {
        return testnum;
    }

    public void setTestnum(int testnum) {
        if (testnum > 0 && testnum < 10)
            this.testnum = testnum;
        /*
        * 在方法中的变量是局部变量
        * 在泪中的变量是成员变量
        * 当成员变量和局部变量名字相同，在方法中使用变量会被默认为局部变量
        * 例：局部变量testnum和成员变量testnum变量名重复
        *     此时如果在setTestnum中写作testnum = testnum
        *     编译器智能识别到形参中的testnum(局部变量)
        *     则对成员变量testnum的赋值失败
        *     this所在的方法被哪个对象调用，this就代表哪个对象
        *     即，this.testnum是成员变量；testnum是局部变量
        */
        else
            System.out.println("error");
    }

    public void test() {
        System.out.println("test");
    }
}
