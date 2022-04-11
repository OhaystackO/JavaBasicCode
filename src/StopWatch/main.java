package StopWatch;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        stopWatch sw=new stopWatch();
        double time=sw.getElapsedTime();

        System.out.println(time);
    }
}
