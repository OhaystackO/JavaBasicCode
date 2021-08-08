package Class;
//类名作为形参，实际是是要传进一个对象
public class CatOperator {
    public void useCat(Cat c){
        c.eat();
    }

    public Cat getCat(){
        Cat c = new Cat();
        return c;
    }
}
