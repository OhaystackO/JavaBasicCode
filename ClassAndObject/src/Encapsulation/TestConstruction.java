package Encapsulation;

public class TestConstruction {
    public static void main(String[] args) {
        ConstructionMethod con = new ConstructionMethod();
        con.show();

        ConstructionMethod con1 = new ConstructionMethod("zhao");
        con1.show();

        ConstructionMethod con2 = new ConstructionMethod("zhao",10);
        con2.show();
    }
}
