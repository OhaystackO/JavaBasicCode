package StringAbout.Exercise;
import java.util.Scanner;
/*
 *    需求：已知用户名和用户密码，请用程序实现模拟用户登录
 *    总共三次机会，登陆之后给出相应提示
 */
public class Login {
    public static void main(String[] args) {
        String userName = "haystack";
        String password = "haystack123";

        GetInput(userName,password);
    }

    public static void GetInput(String userName, String password) {
        //接收一次输入
        String name = getName();
        String key = getKey();

        for (int i = 0; i < 3; ++i){

            //用户名不匹配
            if(! name.equals(userName)){
                System.out.println("用户不存在。");

                name = getName();
                key = getKey();
                i = -1;

                continue;
            }

            //用户名正确但密码不匹配
            else if(name.equals(userName) && ! key.equals(password)){
                if(2-i != 0){
                    System.out.println("\n\n密码输入错误，还剩" + (2-i) +"次机会");
                }
                else {
                    System.out.print("密码已锁定，请稍后重试");
                    break;
                }
                System.out.println("User Name:" + name);
                key = getKey();

                continue;
            }

            //用户名和密码匹配成功
            else if(name.equals(userName) && key.equals(password)){
                System.out.print("欢迎登录。");
                break;
            }
        }
    }

    //接收用户名
    public static String getName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("User Name:");
        String name = sc.nextLine();

        return name;
    }

    //接收密码
    public static  String getKey(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Password:");
        String key = sc.nextLine();

        return key;
    }
}
