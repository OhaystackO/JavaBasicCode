/*
    public String getMessage() 返回此trowable对象的详细消息字符串
    public String toString() 返回此可抛出的简短描述
    public void printStackTrace() 把异常的错误信息输出在控制台
*/
public class TrowableMemberMethod {
    public static void main(String[] args) {
        System.out.println("begain");
        method();
        System.out.println("end");
    }

    public static void method(){
        try{
            int[] arr= {1,2,3};
            System.out.println(arr[3]);//产生错误的地方会执行new操作
            //new ArrayIndexOutOfBoundsException()
        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println("数组越界");
            //=> 数组越界

            //public String getMessage() 返回此trowable对象的详细消息字符串
            System.out.println("getMessage:"+e.getMessage());
            /*
                => Index 3 out of bounds for length 3

                public class Throwable{
                    private String detailMessage;

                    public Throwable(String message){
                        detailMessage = message
                    }


                    public String getMessage() {
                        return detailMessage;
                    }
                }
            */

            //public String toString() 返回此可抛出的简短描述
            System.out.println("toString:"+e.toString());
            //=> java.lang.ArrayIndexOutOfBoundsException:Index 3 out of bounds for length 3

            //public void printStackTrace() 把异常的错误信息输出在控制台
            System.out.print("printStackTrace:");
            e.printStackTrace();
            /*
                java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
                at TrowableMemberMethod.method(TrowableMemberMethod.java:16)
                at TrowableMemberMethod.main(TrowableMemberMethod.java:9)
                at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
                at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
                at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
                at java.base/java.lang.reflect.Method.invoke(Method.java:566)
                at com.intellij.rt.execution.application.AppMainV2.main(AppMainV2.java:131)

            */
        }

    }
}
