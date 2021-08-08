package StringAbout.Exercise;
/*
* 定义一个方法，把int数组中的数据按照指定的格式凭借成一个字符串返回
* 调用该方法并在控制台输出结果
* 例如：int[] arr = {1,2,3}，执行方法后输出结果为:[1,2,3]
*/
public class CatTheString {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String result = CatArray(arr);
        System.out.print(result);
    }

    public static String CatArray(int[] arr){
        String result = "";
        result += "[";

        for(int i = 0; i < arr.length; ++i){
            if(i == arr.length-1 ){
                result += arr[i];
            }else{
                result += arr[i];
                result += ", ";
            }
        }

        result += "]";

        return result;
    }
}
