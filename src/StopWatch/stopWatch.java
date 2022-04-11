package StopWatch;

import java.text.SimpleDateFormat;
import java.util.Date;

public class stopWatch {
    Date date=new Date();
    private long startTime;
    private long endTime;
    SimpleDateFormat df;

    public stopWatch(){
        startTime=date.getTime();
    }

    public long start(){
        startTime=date.getTime();
        return startTime;
    }
    public long end(){
        endTime=date.getTime();
        return endTime;
    }
    public double getElapsedTime(){
        startTime=start();
        int j=0;
        for(long i=0;i<10000;++i){
            j++;
        }
        endTime=end();
        return (startTime-endTime);
    }
    public long getStartTime() {
        return startTime;
    }
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
}
