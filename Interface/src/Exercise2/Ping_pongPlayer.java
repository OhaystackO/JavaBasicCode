package Exercise2;

public class Ping_pongPlayer extends Sportsman implements StudyEnglish{
    public Ping_pongPlayer() {
    }

    public Ping_pongPlayer(int age, String name) {
        super(age, name);
    }

    @Override
    public void study() {
        System.out.println("study ping-pong");
    }

    @Override
    public void eat() {
        System.out.println("ping-pong player eat");
    }

    @Override
    public void studyEnglish() {
        System.out.println("a,b,c,d,e,f,g");
    }
}
