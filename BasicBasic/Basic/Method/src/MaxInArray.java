/*
* 需求：
* 设计一个方法获取数组中的最大值，并调用方法输出结果
*/
public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {3,1,56,95,12,30};
        int max = getMax(arr , arr.length);
        System.out.println(max);
    }

    public static int getMax(int[] nums, int length){
        int max = nums[0];
        for(int i = 0; i < length; ++i){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }
}
