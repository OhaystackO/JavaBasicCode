package Math;

public class MathCommonApi {
    public static void main(String[] args) {
        //返回参数的绝对值
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println();

        //返回大于等于参数的最小整数
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(14.56));
        System.out.println();

        //返回小于等于参数的最大整数
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(14.56));
        System.out.println();

        //按照四舍五入返回
        System.out.println(Math.round(12.34F));
        System.out.println(Math.round(14.56F));
        System.out.println();

        //返回较大值
        System.out.println(Math.max(44,33));
        System.out.println();

        //返回较小值
        System.out.println(Math.min(33,22));
        System.out.println();

        //返回a值得b次方
        System.out.println(Math.pow(2.0,3.0));
        System.out.println();

        //返回一个0.0到1.0之间的随机值
        System.out.println(Math.random());
        //生成0-99的随机数
        System.out.println((int)(Math.random()*100));
        //生成1-100的随机数
        System.out.println((int)(Math.random()*100)+1);
    }
}
