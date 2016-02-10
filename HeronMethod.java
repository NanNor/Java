import java.util.Random;

/**
 * Created by hepstev on 25.01.16.
 */
public class HeronMethod {
    public static void main(String[] args){
        double sqrt = 0;
        Random rnd = new Random();
        double start = rnd.nextInt(900);
        double wSqrt = 1.44;//rnd.nextInt(100*100);
        for(int i = 0; i < 20; i++){
            sqrt = (start+(wSqrt/start))/2;
            start = sqrt;
        } // convert fast
        System.out.println("The square root of "+wSqrt+" is "+sqrt);
    }
}
