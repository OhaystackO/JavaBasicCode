package Exercise;

public class Test {
    public static void main(String[] args) {
        Jumpping cat1 = new Catimpl("cat1",1);
        Jumpping dog1 = new Dogimpl("dog1",1);

        Animal cat2 = new Catimpl();
        Animal dog2 = new Dogimpl();
        cat2.setName("cat2");
        dog2.setName("dog2");
        cat2.setAge(1);
        dog2.setAge(1);

        System.out.println(((Catimpl) cat1).getName()+((Catimpl) cat1).getAge());
        System.out.println(((Catimpl) cat2).getName()+((Catimpl) cat2).getAge());

        System.out.println(((Dogimpl) dog1).getName()+((Dogimpl) dog1).getAge());
        System.out.println(((Dogimpl) dog2).getName()+((Dogimpl) dog2).getAge());

        System.out.println();

        /*
            cat1和dog1是接口引用指向实现类对象
            Jumpping接口中有jump方法
            Animal类中有eat方法
        */

        ((Catimpl) cat1).eat();
        cat1.jump();
        ((Dogimpl) dog1).eat();
        dog1.jump();

        /*
            cat2和dog2是父类引用指向子类对象
            Jumpping接口中有jump方法
            Animal类中有eat方法
        */
        cat2.eat();
        ((Catimpl) cat2).jump();
        dog2.eat();
        ((Dogimpl) dog2).jump();



    }
}
