/**
 * Created by hepstev on 21.03.16.
 */
public class HouseNumber {
    public static void main(String[] args){
        for(int i = 0; i < 80; i++){
            if(i%3 == 0){
                if(i > 50 && i < 60 && i%4 == 0 && i%6 == 0){
                    print(i);
                }
            }
            else if(i%4 != 0){
                if(i> 60 && i < 69 && i%6 == 0 && i%3 != 0){
                    print(i);
                }
            }
            else if(i%6 != 0){
                if(i > 70 && i < 79 && i%3 != 0 && i%4 == 0){
                    print(i);
                }
            }
        }
    }
    public static void print(Object ob){
        System.out.println(ob);
    }
}
