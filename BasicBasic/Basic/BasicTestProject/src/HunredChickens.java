/*
* 百钱百鸡：
* 设公鸡5文一只，母鸡3文一只，小鸡仔一文三只
* 问：一百文钱买一百只鸡，公鸡、母鸡、小鸡仔各几只
*/
public class HunredChickens {
    public static void main(String[] args) {
        chicken();
    }

    public static void chicken(){
        for(int x = 0; x<= 20; ++x){
            for(int  y = 0; y < 33; ++y){
                int z = 100 - x - y;

                if(z%3 == 0 && 5*x + 3*y + z/3 == 100){
                    System.out.println(x + "," + y + "," + z);
                }
            }
        }
    }
}
