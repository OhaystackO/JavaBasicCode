package Array;

public class AllArrayTest {

    public int[] all(int[] a,int[] b){
        int[] result=new int[18];
        int index=0;
        //倒置数组
        for(int i =a.length-1;i>=0;--i){
            result[index]=a[i];
            index++;
        }
        //数组除0
        for(int i=0;i<b.length;++i){
            if(b[i]!=0){
                result[index]=b[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a={1,0,9,4,7,2};
        int[] b={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        AllArrayTest allTest=new AllArrayTest();
        int[] result=allTest.all(a,b);

        for(int i =0;i< result.length;++i){
            System.out.print(result[i]+" ");
        }
    }
}
