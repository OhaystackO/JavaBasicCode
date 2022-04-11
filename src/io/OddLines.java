package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OddLines {
    public static void main(String[] args) {
        BufferedReader br=null;
        int l=1;
        String str;
        try {
            br=new BufferedReader(new FileReader("D:/oddline.txt"));//创建输入流
            do{
                str=br.readLine();//读取行
                if(l%2!=0){//判断行数是否为奇数
                    System.out.println(str);
                }
                l++;
            }while(str!=null);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
