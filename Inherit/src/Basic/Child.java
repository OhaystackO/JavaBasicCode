package Basic;

public class Child extends Father{
    public int num/*2*/ = 20;

    public Child(){
        System.out.println("子类无参构造方法");
    }
    public Child(int num){
        System.out.println("子类有参构造方法");
    }

    public void show(){
        System.out.println("Child.show 方法被调用");
    }

    public void method(){
        int num/*1*/ = 30;

        System.out.println(num);
        //同名num被访问的顺序为num1->num2->num3
        System.out.println(this.num);
        //通过this关键字访问当前类中的成员变量
        System.out.println(super.num);
        //通过super关键字访问父类中的成员变量
    }
}
