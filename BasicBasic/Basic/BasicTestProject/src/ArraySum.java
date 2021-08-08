/*
* 需求：
*   已知数组{68,27,95,88,171,996,51,210}，求出数组中满足要求的元素和
*   要求：求和的元素个位和十位不能是7，并且只能是偶数
*/
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {68,27,95,88,171,996,51,210};
        int sum = evenSum(arr);

        System.out.println("\n"+sum);
    }

    public static int evenSum(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; ++i){
            if(nums[i]/10%10 != 7 && nums[i]%10 != 7 && nums[i]%2 == 0){
                System.out.println(nums[i]);
                sum += nums[i];
            }
        }

        return sum;
    }
}
