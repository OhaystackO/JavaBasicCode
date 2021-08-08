import java.util.ArrayList;

/*
 * public ArrayList() 构建一个空的集合对象
 * public boolean add(E e) 将制定的元素追加到此集合的末尾
 * public void add(int index,E element) 在次集合中的指定位置插入指定元素
 */
public class ArrayListConstruction {
    public static void main(String[] args) {
        //无参构造函数创建集合
        ArrayList<String> array = new ArrayList<String>();

        System.out.println("array:" + array);

        //public boolean add(E e)将制定的元素追加到此集合的末尾
        array.add("hello");
        array.add("world");
        array.add("haystack");

        System.out.println("array:" + array);

        //public void add(int index,E element)在次集合中的指定位置插入指定元素
        //注意数组越界问题
        array.add(1,"length");
        System.out.println("array:" + array);
    }
}
