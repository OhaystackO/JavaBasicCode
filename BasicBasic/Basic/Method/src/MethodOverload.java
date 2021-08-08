/*
* 方法重载构成条件
* 1.多个方法在同一个类中
* 2.多个方法具有相同的方法名
* 3.多个方法的参数不同，类型货数量不同
*
* 方法重载的特点：重载仅针对同一类中方法的名称和参数进行识别，与返回值无关
*
* 需求：
* 1.求两个int类型数据和
* 2.求两个double类型数据和
* 3.求三个int类型数据和
*/
public class MethodOverload {
    public static void main(String[] args) {
        int sum1,sum3;
        double sum2;
        sum1 = sum(1,2);
        sum2 = sum(0.2,3.4);
        sum3 = sum(3,7,1);

        System.out.println(sum1 + "," + sum2 + ","+sum3);
    }

    public static int sum(int a, int b){
        return a+b;
    }
    public static double sum(double c, double d){
        return c+d;
    }
    public static  int sum(int e, int f, int g){
        return e+f+g;
    }
}
