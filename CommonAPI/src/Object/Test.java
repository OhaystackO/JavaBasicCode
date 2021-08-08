package Object;

public class Test {
    public static void main(String[] args) {
        Student s= new Student();
        s.setName("h");
        s.setAge(10);
        System.out.println(s);//Object.Student@282ba1e
        System.out.println(s.toString());//Object.Student@282ba1e
        /*
        public void println(Object x) {//x = s
            String s = String.valueOf(x);
            synchronized (this) {
                print(s);
                newLine();
            }
        }

        public static String valueOf(Object obj) {//obj = x
            return (obj == null) ? "null" : obj.toString();
        }
        //obj = x = s = new Student != null
        //所以最后结果是obj.toString()

        //返回对象的字符串表示形式
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
        */


    }
}
