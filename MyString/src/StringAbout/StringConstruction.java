package StringAbout;
/*
* String构造方法：
*   pubilc String()，创建一个空白字符串对象，不含有任何内容
*   public String(char[] chs)，根据字符数组的内容来创建字符串对象
*   public String(byte[] bys)，根据字节数组的内容来创建字符串对象
*   String = "abc"，直接复制的方式创建字符串对象
*/
public class StringConstruction {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("s1:" + s1);

        char[] chs = {'t','i','m','e'};
        String s2 = new String(chs);
        System.out.println("s2" + s2);

        byte[] bys = {110,111};
        String s3 = new String(bys);
        System.out.println("s3:" + s3);

        String s4 = "see";
        System.out.println("s4:" + s4);
    }
}
