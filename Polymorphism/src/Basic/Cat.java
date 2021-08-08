package Basic;

//1.多态要满足继承(实现)关系
public class Cat extends Animal{
    //2.多态要满足方法重写
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

}
