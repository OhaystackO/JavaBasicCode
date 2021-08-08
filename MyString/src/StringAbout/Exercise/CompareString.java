package StringAbout.Exercise;

/*
 * 使用==比较时:比较基本类型时，比较的是数据值
 *              比较引用类型时，比较的是地址值
 *
 * 分别使用==和String类的equals方法比较两个字符串的值和地址值是否相等
 */
public class CompareString {
    public static void main(String[] args) {
        char[] chs = {'l', 'o', 'n', 'g'};
        String s1 = new String(chs);
        String s2 = new String(chs);

        String s3 = "long";
        String s4 = "long";

        //使用==比较地址值
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println((s3 == s4) + "\n\n");

        //使用equals比较内容
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}
