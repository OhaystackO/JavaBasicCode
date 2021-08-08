package Basic;

public class Father {
    public int num/*3*/ = 10;

    public Father(){
        System.out.println("父类无参构造方法");
    }
    public Father(int num){
        System.out.println("父类有参构造方法");
    }

    public void show(){
        System.out.println("Father.show 方法被调用");
    }
}
