/*
* 带参数的方法定义格式：
*   public static void 方法名(参数){ 方法体 }
*
* 调用格式：
*   方法名(参数);
*
* 需求：1.定义一个方法，该方法接受一个参数，判断该数据是否是偶数
*       2.设计一个方法用于打印两个数中的较大数，数据来自于方法参数
*/
public class MethodWithPrama {
    public static void main(String[] args) {

        int a = 13;
        isEvenNumber(a);
        isEvenNumber(8);

        System.out.println("------");

        int number1 = 5;
        int number2 = 18;
        getMax(number1,number2);
        getMax(14,3);
    }

    public static void isEvenNumber(int num){
        if(num % 2 == 0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

    public static void getMax(int num1,int num2){
        if(num1 > num2){
            System.out.println(num1);
        }
        else{
            System.out.println(num2);
        }
    }
}
