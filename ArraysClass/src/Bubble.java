/*
    冒泡排序：
        对要进行排序的数据中相邻的数据进行两两比较，将较大的数据放在后面
        依次对所有数据进行操作，直至所有数据按要求完成排序
    冒泡排序结论：
        如果有n个元素进行比较只用比较n-1次
        每一次比较的下一次比较少一个元素参加比较
*/
public class Bubble {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        System.out.println("before:" + arrayToString(arr));

        /*//第一次比较
        for (int i = 0; i < arr.length - 1 - 0; ++i) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("after:" + arrayToString(arr));

        //第二次比较
        for (int i = 0; i < arr.length - 1 - 1; ++i) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("after2:" + arrayToString(arr));

        //第三次比较
        for (int i = 0; i < arr.length - 1 - 2; ++i) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("after3:" + arrayToString(arr));

        //第四次比较
        for (int i = 0; i < arr.length - 1 - 3; ++i) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("after4:" + arrayToString(arr));*/

        for (int x = 0; x < arr.length - 1; ++x) {
            for (int i = 0; i < arr.length - 1 - x; ++i) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("after:" + arrayToString(arr));
    }

    //把数组转换成规定格式的字符串
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; ++i) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
