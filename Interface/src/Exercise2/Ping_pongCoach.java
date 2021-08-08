package Exercise2;

public class Ping_pongCoach extends Coach implements StudyEnglish{
    public Ping_pongCoach(int age, String name) {
        super(age, name);
    }

    public Ping_pongCoach() {
    }

    @Override
    public void teach() {
        System.out.println("teach ping-pong");
    }

    @Override
    public void eat() {
        System.out.println("ping-pong coach eat");
    }

    @Override
    public void studyEnglish() {
        System.out.println("a,b,c,d,e,f,g");
    }
}
