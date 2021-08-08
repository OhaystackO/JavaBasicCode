package PowerModifier.SamePackage;

public class Father {
    private void privateShow(){
        System.out.println("private");
    }
    void defaultShow(){
        System.out.println("default");
    }
    protected void protectedShow(){
        System.out.println("protected");
    }
    public void publicShow(){
        System.out.println("public");
    }

    public static void main(String[] args) {
        Father f = new Father();
        f.privateShow();
        f.defaultShow();
        f.protectedShow();
        f.publicShow();
        //无报错，即在当前类四种权限均可访问
    }
}