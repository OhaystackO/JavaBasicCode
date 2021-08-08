package Interface;
/*
    参数是接口名，要的是接口的实现类对象
    返回值是接口名，返回的是该接口的实现对象
*/
public class JumppingOperater {
    public void useJumpping(Jumpping j){
        j.jump();
    }

    public Jumpping getJumpping(){
        Jumpping j = new Jumppingimpl();
        return j;
    }
}
