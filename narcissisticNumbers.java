import java.util.ArrayList;
/**
 * Created by hepstev on 01.02.16.
 */
public class narcissisticNumbers {
public static void main(String[] args){
    long sum = 0;
    for(int i = 2; i <= 531441; i++ ){
        if(isNarcissistic(i)){
            sum+=i;
        }
}
    System.out.println(sum);
}
    public static boolean isNarcissistic(long n){
        ArrayList<Long> nr = new ArrayList<>();
        long m = n;
        long p = 0;
        while(m != 0){
            nr.add(m%10);
            m = m/10;
        }
        for(int i = 0; i<nr.size(); i++){
            p = p+(long)Math.pow(nr.get(i),5);
        }
        if(n == p){
            System.out.println("narcissistic number "+n);
            return true;
        }
        return false;
    }
}
