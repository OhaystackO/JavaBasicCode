package PowerModifier.DiffrentPackage;
import PowerModifier.SamePackage.Father;
public class Test {
    public static void main(String[] args) {
        Father f = new Father();
        f.publicShow();
        //不同包，不是子类的类只能访问公开类
    }
}
