import java.util.ArrayList;

/*
* ArrayList中的常用方法:
* public boolean remove(Object o),删除指定元素返回是否删除成功
* public E remove(int index),删除指定索引处的元素并返回删除的元素
* public E set(int index,E element),修改指定索引处的元素并返回被修改的元素
* public E get(int index),返回指定索引处的元素
* public int size(),返回集合中的元素个数
*/
public class ArrayListMethod {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> array = new ArrayList<String>();

        //添加元素
        array.add("hello");
        array.add("world");
        array.add("haysatck");

        System.out.println("array:" + array);

        //public boolean remove(Object o),删除指定元素返回是否删除成功
        System.out.println(array.remove("world"));
        System.out.println("array:" + array);
        System.out.println(array.remove("java"));

        //public E remove(int index),删除指定索引处的元素并返回删除的元素
        System.out.println(array.remove(1));
        System.out.println("array:" + array);

        //public E set(int index,E element),修改指定索引处的元素并返回被修改的元素
        System.out.println(array.set(1,"java"));
        System.out.println("array:" + array);

       //public E get(int index),返回指定索引处的元素
        System.out.println(array.get(0));
        System.out.println("array:" + array);

        //* public int size(),返回集合中的元素个数
        System.out.println(array.size());
    }
}
