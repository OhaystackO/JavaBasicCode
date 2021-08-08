public class CirculateControl {
    public static void main(String[] args) {
        for(int i = 1;i < 6;++i){
            if(i%2 == 0){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("----------");

        for(int j = 1;j < 6;++j){
            if(j%2 == 0){
                break;
            }
            System.out.println(j);
        }
    }
}
