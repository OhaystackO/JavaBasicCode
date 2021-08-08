package UseAnonymityInnerClass;

public class Test {
    public static void main(String[] args) {
        JumpingOperater jo = new JumpingOperater();
        Jumping j = new Cat();
        Jumping j2 = new Dog();
        jo.method(j);
        jo.method(j2);
        System.out.println("---------");

        //匿名内部类的形式进行改进
        jo.method(new Jumping() {
            @Override
            public void jump() {
                System.out.println("cat jump2");
            }
        });

        jo.method(new Jumping() {
            @Override
            public void jump() {
                System.out.println("dog jump2");
            }
        });
        //对于只使用一次的类，没必要独立创建一个类，直接使用匿名内部类创建一次性的对象
    }
}
