package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/*
    IO流结合Properties创建属性文件
        1.创建流
        2.创建properties集合
        3.使用load方法将文件中的内容加载到集合中
*/
public class IoAndProperties {
    public static void main(String[] args) {
        FileInputStream fis=null;
        Properties pro=null;
        try {
            fis=new FileInputStream("D:/info.txt");//创建流
            pro=new Properties();//创建map集合对象
            pro.load(fis);
            Set keys=pro.keySet();
            Iterator it=keys.iterator();
            while(it.hasNext()){
                Object key=it.next();
                System.out.print(key);
                System.out.println(","+pro.get(key));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if(fis!=null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
