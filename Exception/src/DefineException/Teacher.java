package DefineException;

public class Teacher {
    public static void checkScore(int score) throws ScoreException{
        if(score <0 || score >100){
            throw new ScoreException("分数有误");
            //throw关键字用于在方法内部抛出异常对象
        }else{
            System.out.println("normal score");
        }
    }
}
