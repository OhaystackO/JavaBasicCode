/*
* 用Debug查看偶数和的循环执行流程
*
*/
public class EvenSum {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 0; i <= 10; ++i){
            if(i%2 == 0){
                sum += i;
            }
        }
        System.out.println("even numbers sum = " + sum);
    }
}
