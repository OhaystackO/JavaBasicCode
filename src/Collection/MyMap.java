package Collection;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] arg){
        Map<Integer,String> map=new HashMap<Integer, String>();
        //向集合中插入元素
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(4,"zhaoliu");
        //遍历集合并打印键值对
        for(int i=1;i<=map.size();i++){
            System.out.println(i+","+map.get(i));
        }
        System.out.println("----------");
        //删除指定的键值对应的条目
        map.remove(1);
        for(int i=1;i<5;i++){
            System.out.println(i+","+map.get(i));
        }
        System.out.println("----------");
        //修改指定的值
        map.replace(2,"lisi","zhangsan");
        for(int i=1;i<5;i++){
            System.out.println(i+","+map.get(i));
        }
        System.out.println("----------");
    }
}
