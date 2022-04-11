package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass {
    public static void main(String[] arg){
        //转置给定list
        List<Integer> src=new ArrayList<>();//原
        src.add(1);src.add(0);src.add(9);src.add(4);src.add(7);src.add(2);
        /*while(it.hasPrevious()){
            dst.add(src.get(it.previousIndex()));
        }
        for(int i=src.size()-1;i>=0;i--){
            dst.add(src.get(i));
        }*/
        System.out.println(src);
        Collections.reverse(src);
        System.out.println(src);
        System.out.println("------------");

        //生成对象
        CollectionClass col=new CollectionClass();
        int index=col.listTest((ArrayList<Integer>) src,4);
        System.out.println(index);
    }
    //返回数据第一次出现的索引
    public int listTest(ArrayList<Integer> al,Integer s){
        int index=-1;
        for(int i=0;i<al.size();++i){
            if(al.get(i)==s){
                index=i;
            }
        }
        return index;
    }
}
