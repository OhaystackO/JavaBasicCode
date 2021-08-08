/*
*定义一个方法用于判断并给出两数中的较大值
*/
public class GetMax {
    public static void main(String[] args) {
        getMax();

    }

    public static void getMax(){
        int a = 10;
        int b = 11;
        if(a > b){
            System.out.println("max:" + a);
        }
        else {
            System.out.println("max:" + b);
        }
    }
}
