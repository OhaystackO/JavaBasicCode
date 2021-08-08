package MemberTrait;

//public class Interimpl implements Inter{

public class Interimpl extends Object implements Inter{

    public Interimpl(){
        super();
    }

    @Override
    public void method() {
        System.out.println("method");
    }

    @Override
    public void show() {
        System.out.println("show");
    }
}