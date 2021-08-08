package ExtendAttention.Exercise;

import java.util.ArrayList;

/*
* 创建一个存储字符串的集合，存储3个字符串元素
* 使用程序是现在控制台遍历该集合
*/
public class StringArrayList {
    public static void main(String[] args) {
        ArrayList <String> str = new ArrayList<String>();
        str.add("happy");
        str.add("angry");
        str.add("hello");

        for(int i = 0; i < str.size(); ++i){
            System.out.println(str.get(i));
        }
    }
}
