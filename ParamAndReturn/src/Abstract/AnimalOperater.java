package Abstract;
/*
    抽象类做类名需要的是抽象类的子类对象
    方法的返回值是抽象类名，实际上返回的是抽象类的子类对象
*/
public class AnimalOperater {
    public void useAnimal(Animal a){
        a.eat();
    }

    public Animal getAnimal(){
        Animal a2 = new Cat();
        return a2;
    }
}
