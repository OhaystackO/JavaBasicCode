/*
方法定义格式：
    public static void 方法名(){
        //方法体
    }
调用格式：
    方法名();

方法必须先定义后调用
*/
public class InitMethod {
    public static void main(String[] args) {
        isEvenNumber();
    }

    public static void isEvenNumber(){
        int num = 21;
        if(num % 2 == 0){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
