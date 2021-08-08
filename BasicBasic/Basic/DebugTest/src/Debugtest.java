/*
* Debug操作流程：
* 1.添加断点（单击行号后的空白）
* 2.右键debug运行
* 3.debug过程中可查看变量变化过程
* 4.按F7执行下一条语句
* 5.删除断点
*/
public class Debugtest {
    public static void main(String[] args) {
        int i =10;
        int j =20;

        int sum = i+j;

        System.out.println("sum:" + sum);
    }
}
