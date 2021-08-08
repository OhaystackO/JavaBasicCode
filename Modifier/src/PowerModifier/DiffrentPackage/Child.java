package PowerModifier.DiffrentPackage;
import PowerModifier.SamePackage.Father;

public class Child extends Father{
    public static void main(String[] args) {
        Child c = new Child();
        c.protectedShow();
        c.publicShow();
        //不同包的子类只能访问父类公开类和保护类
    }
}
