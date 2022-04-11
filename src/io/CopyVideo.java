package io;

import java.io.*;

/*6.新建X文件夹，将视频文件放在其中，新建Y文件夹，用IO流复制X文件夹中的视频文件到Y文件夹中*/
public class CopyVideo {
    public static void main(String[] args) {
        int len=0;
        //创建两个FILE对象
        File src=new File("D:/X/SRC.mp4");
        File dst=new File("D:/Y/DST.mp4");
        //创建两个流
        FileInputStream fis=null;
        FileOutputStream fos=null;
        //用一个byte数组一边从X读一边向Y写
        try {
            fis=new FileInputStream(src);
            fos=new FileOutputStream(dst);
            byte[] buffer=new byte[1024];
            while((len=fis.read(buffer))>0){
                fos.write(buffer,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{//最终都要执行关闭流的操作
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
