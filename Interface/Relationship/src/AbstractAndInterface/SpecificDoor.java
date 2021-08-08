package AbstractAndInterface;
/*
* 具体门类：
*       有些门具备开关的功能，
*       有些门具备拉警报的动作，
*       有些门两者都有
*       以此来决定是否继承或实现抽象类和接口
*/
public class SpecificDoor extends Door implements Alarm{

    @Override
    public void alarm() {
        System.out.println("alarm");
    }

    @Override
    public void open() {
        System.out.println("open");
    }

    @Override
    public void close() {
        System.out.println("close");
    }
}
