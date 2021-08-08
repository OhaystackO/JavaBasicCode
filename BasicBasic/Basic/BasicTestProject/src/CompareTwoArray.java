public class CompareTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4,5,6,7};
        int[] arr2 = {12,3,4,5,6};
        int[] arr3 = {1,2,3,4,5,6};
        int[] arr4 = {2,3,4,5,6,7};

        boolean result1 = compare(arr1,arr2);
        System.out.println(result1+"\n");

        boolean result2 = compare(arr1,arr3);
        System.out.println(result2+"\n");

        boolean result3 = compare(arr1,arr4);
        System.out.println(result3);
    }

    public static boolean compare(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            System.out.println("长度不同");
            return false;
        }else {
            for (int i = 0; i < arr1.length; ++i) {
                if (arr1[i] != arr2[i]) {
                    System.out.println("元素不同");
                    return false;
                }
            }
            System.out.println("长度相同，元素相同");
            return true;
        }
    }
}
