package StringAbout;
/*
    字符串对象特点
*   通过new关键字创建的字符串，不论内容是否相同，都会分配新的内存空间
*   但通过“”的形式创建的字符串，只要字符序列相同，无论出现几次都只有一个对象并放在字符串池中维护
*/
public class StringObjectFeatures {
    public static void main(String[] args) {
        char[] chs = {'l','o','n','g'};
        String s1 = new String(chs);
        String s2 = new String(chs);
        System.out.println(s1 == s2);

        String s3 = "time";
        String s4 = "time";
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);
    }
}
