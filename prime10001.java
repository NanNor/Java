
/**
 * Created by hepstev on 07.12.15.
 */
public class prime10001 {
    public static void main(String[] args) {
        for(int i = 1, count = 0; ;i++) {
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
