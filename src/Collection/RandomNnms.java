package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNnms {
    public static void main(String[] args) {
        List<Integer> big=new ArrayList<>();//最终大于10的数字
        int[] randnums=new int[10];//所有随机数
        Random rn=new Random();
        for(int i=0;i<randnums.length;i++){
            randnums[i]=rn.nextInt(100);
        }
        for(int i=0;i<randnums.length;i++){
            if(randnums[i]>=10){
                big.add((Integer) randnums[i]);
            }
        }
        System.out.println(big);
    }
}
