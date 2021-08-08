package DefineException;
/*
    自定义异常类，继承自Exception即可
*/
public class ScoreException extends Exception{
    public ScoreException(){}

    public ScoreException(String message){
        super(message);
    }
}
