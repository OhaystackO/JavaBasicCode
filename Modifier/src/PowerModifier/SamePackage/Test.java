package PowerModifier.SamePackage;

public class Test {
    public static void main(String[] args) {
        Father f = new Father();
        f.publicShow();
        f.protectedShow();
        f.defaultShow();
        //同一包下，没有继承关系也可访问这三种权限
    }
}
