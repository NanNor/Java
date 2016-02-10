
/**
 * Created by hepstev on 08.12.15.
 */
public class divisibleTriangularNumber  {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i<Integer.MAX_VALUE;i++) {
            if(isprime(i)){
                count++;
                if(count == 10001){
                    System.out.println("The "+count+" prime is "+i);
                    break;
                }
            }
        }
    }
    public static boolean isprime(long n){
        for(int i = 2; i<=n/2+1;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
