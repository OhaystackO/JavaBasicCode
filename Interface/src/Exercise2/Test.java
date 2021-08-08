package Exercise2;

public class Test {
    public static void main(String[] args) {
        Sportsman ppplayer1 = new Ping_pongPlayer(20,"Appplayer");
        Ping_pongPlayer ppplayer2 = new Ping_pongPlayer(21,"Bppplayer");
        Coach ppcoach1 = new Ping_pongCoach(35,"Appcoach");
        Ping_pongCoach ppcoach2 = new Ping_pongCoach(34,"Bppcoach");

        Sportsman bbplayer1 = new BaskateballPlayer(21,"Abbplayer");
        BaskateballPlayer bbplayer2 = new BaskateballPlayer(20,"Bbbplayer");
        Coach bbcoach1 = new BaskateballCoach(36,"Abbcoach");
        BaskateballCoach bbcoach2 = new BaskateballCoach(33,"Bbbcoach");

        System.out.println(ppplayer1.getName()+ppplayer1.getAge());
        ppplayer1.study();//继承自父类Sportsman，编译看父类，运行看子类
        ((Ping_pongPlayer) ppplayer1).studyEnglish();//父类引用指向子类对象，Sportsman没有实现接口，所以强制转型为PPP
        ppplayer1.eat();//继承自父类，父类未实现该方法，子类进行实现，编译看父类，运行看子类

        System.out.println(ppplayer2.getName()+ppplayer2.getAge());
        ppplayer2.eat();
        ppplayer2.study();
        ppplayer2.studyEnglish();

        System.out.println(bbplayer1.getName()+bbplayer1.getAge());
        bbplayer1.eat();//继承自父类，父类没有重写，子类进行重写
        bbplayer1.study();//继承自父类
        //该类没有实现StudyEnglish接口
        System.out.println(bbplayer2.getName()+bbplayer2.getAge());
        bbplayer2.eat();
        bbplayer2.study();

        System.out.println(ppcoach1.getName()+ppcoach1.getAge());
        ((Ping_pongCoach) ppcoach1).studyEnglish();//父类引用指向子类对象，父类未实现接口，所以转型为子类
        ppcoach1.teach();//继承自父类
        ppcoach1.eat();//继承自父类，父类未重写，子类进行重写

        System.out.println(ppcoach2.getName()+ppcoach2.getAge());
        ppcoach2.eat();
        ppcoach2.studyEnglish();
        ppcoach2.teach();

        System.out.println(bbcoach1.getName()+bbcoach1.getAge());
        bbcoach1.eat();
        bbcoach1.teach();

        System.out.println(bbcoach2.getName()+bbcoach2.getAge());
        bbcoach2.teach();
        bbcoach2.eat();
    }
}
