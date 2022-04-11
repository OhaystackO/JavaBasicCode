package Collection;

import java.util.HashMap;
import java.util.Map;

public class AdressMap {
    public static void main(String[] args) {
        String[] big={"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] small={"哈尔滨","杭州","南昌","广州","福州"};
        Map<String,String> result=new HashMap<>();

        for(int i=1;i<=big.length;i++){
            result.put(big[i-1],small[i-1]);
        }
        System.out.println(result);
    }
}
