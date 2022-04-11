package SerializableTest;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import reflect.Student;

import java.io.*;

public class Serialize {
    public static void main(String[] args) {
        Student stu=new Student(10,10,10);
        /*
        序列化对象到文件
            1.参与序列化的对象需要实现Serializable接口
            2.创建对象
            3.创建输出流
            4.序列化对象
            5.刷新关闭流
        */
        ObjectOutputStream oos=null;
        try {
            oos=new ObjectOutputStream(new FileOutputStream("D:/stu2"));//创建流
            oos.writeObject(stu);//序列化对象
        } catch (
                IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(oos!=null){
                    oos.flush();
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /*
        反序列化文件对象到程序中：
            1.创建流
            2.接收对象
            3.关闭流
        */
        ObjectInputStream ois=null;
        Student stu2=null;
        try {
            ois=new ObjectInputStream(new FileInputStream("D:/stu2"));
            stu2=(Student) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            try {
                if(ois!=null){
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(stu2);
    }
}
