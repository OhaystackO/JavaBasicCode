package PowerModifier.SamePackage;

public class Child extends Father{
    public static void main(String[] args) {
        Child c = new Child();
        c.defaultShow();
        c.protectedShow();
        c.publicShow();
        //子类不能访问父类私有权限，private只能在本类访问
    }
}
