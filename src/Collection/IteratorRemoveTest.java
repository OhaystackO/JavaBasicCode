package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    测试线程的三种创建方法
    1.继承Thread
    2.实现Runnable接口
    3.匿名内部类
    测试使用迭代器进行遍历时删除会不会删除所有元素，如果不会，为什么？
*/
public class IteratorRemoveTest {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(new Student("zhangsan",10));
        list.add(new Student("lisi",20));
        list.add(new Student("wangwu",30));

        System.out.println(list);


        //在迭代过程中删除元素使用list.remove，然后重新获取迭代器对象，更新迭代器的状态
        Iterator it=list.iterator();
        while(it.hasNext()){
            Object o=it.next();
            it.remove();
        }

        System.out.println(list);
    }
}