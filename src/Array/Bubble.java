package Array;

public class Bubble {
    public static void main(String[] args) {
        int[] arr={100,3,62,7,45,221,12,54,24,1,30};
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;++j){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
