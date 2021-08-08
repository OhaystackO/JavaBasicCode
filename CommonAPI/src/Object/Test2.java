package Object;

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("haystack",21);
        Student s2 = new Student("haystack",21);

        //比较地址
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        //s2向上转型为Object
        /*
            public boolean equals(Object obj) {
                //this == s1 equals中默认调用该方法的是this
                //obj == s2
                return (this == obj);
                //返回值是比较地址
            }
            子类可以进行重写
        */
    }
}
