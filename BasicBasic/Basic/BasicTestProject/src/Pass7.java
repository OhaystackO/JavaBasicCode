/*
* 逢七过游戏：
* 每逢七或七的倍数跳过
*
*/
public class Pass7 {
    public static void main(String[] args) {
        no7();
    }
    public static void no7(){
        for(int i = 1; i <= 100; ++i){
            if(i % 7 == 0 || i % 10 == 7 || i / 10 == 7){
                System.out.println("过(" + i + ")");
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
