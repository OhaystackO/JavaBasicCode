
public class QuadraticEquation {
    private int a,b,c;
    public QuadraticEquation(int a,int b,int c) {
    }

    public double getDiscriminant(int a,int b,int c){
        int result=(b*b)-(4*a*c);
        return Math.abs(result);
    }
    public double getRoot1(int a,int b,double result){
        double r1=(-b+Math.sqrt(result))/(2*a);
        return r1;
    }
    public double getRoot2(int a,int b,double result){
        double r2=(-b-Math.sqrt(result))/(2*a);
        return r2;
    }

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }

    public static void main(String[] args) {
        QuadraticEquation qe=new QuadraticEquation(1,7,4);
        double dis=qe.getDiscriminant(qe.getA(),qe.getB(),qe.getC());
        double root1=qe.getRoot1(qe.getA(),qe.getB(),dis);
        double root2=qe.getRoot1(qe.getA(),qe.getB(),dis);

        System.out.println("root1:"+root1+",root2:"+root2);
    }
}
