/**
 * Created by hepstev on 08.12.15.
 */
public class LowestDivisor {
    public static void main(String[] args){
        for(int i = 2, count = 1, number = 2; i< Integer.MAX_VALUE;i++){
            while(number <=20){
                if(i%number == 0){
                    number++;
                    count++;
                    if(count == 19){
                        System.out.println("This is the right number "+i);
                    }
                }
                else {
                    count = 1;
                    number++;
                }
            }
            number = 2;
        }


    }
}
