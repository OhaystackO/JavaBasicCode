package Basic;

public class Cat implements Jupping{
    //2.类继承接口用implements关键字称为类实现接口
    @Override
    public void jump() {
        System.out.println("cat jump");
    }
}
