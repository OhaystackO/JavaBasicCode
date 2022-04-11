package Array;

public class arr {
    public static void main(String[] args) {
        //倒置数组
        int[] intArray={1,0,9,4,7,2};
        for(int i =intArray.length-1;i>=0;--i){
            if(i==0){
                System.out.print(intArray[i]);
            }else{
                System.out.print(intArray[i]+",");
            }
        }
        System.out.println();
        System.out.println("-------------");


        //数组除0
        int[] oldArr = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int[] newArr=new int[12];
        int index=0;
        for(int i=0;i<oldArr.length;++i){
            if(oldArr[i]!=0){
                newArr[index]=oldArr[i];
                index++;
            }
        }
        for(int i =0;i< newArr.length;++i){
            if(i==newArr.length-1){
                System.out.print(newArr[i]);
            }else{
                System.out.print(newArr[i]+",");
            }
        }
        System.out.println();
        System.out.println("------------");


        //合并数组
        int[] result=new int[13];
        int[] a={1,7,9,11,13,15,17,19};
        int[] b={2,4,6,8,10};
        index=0;
        for(int i=0;i<a.length;++i){
            result[index]=a[i];
            index++;
        }
        for(int i=0;i<b.length;++i){
            result[index]=b[i];
            index++;
        }
        for(int i =0;i< result.length;++i){
            if(i==result.length-1){
                System.out.print(result[i]);
            }else{
                System.out.print(result[i]+",");
            }
        }
        System.out.println();
        System.out.println("------------");


        //二维数组
        char[][] arr=new char[4][5];
        for(int i =0;i<4;++i){
            for(int j=0;j<5;++j){
                arr[i][j]='*';
            }
        }
        for(int i=0;i<4;++i){
            for(int j=0;j<5;++j){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------");


        //冒泡排序

    }
}
