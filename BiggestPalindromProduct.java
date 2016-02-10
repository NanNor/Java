import java.util.ArrayList;

/**
 * Created by hepstev on 07.12.15.
 */
public class BiggestPalindromProduct {
    public static void main(String[] args) {
        System.out.println(palindrom());
        }

    public static int palindrom() {
        ArrayList<Integer> palin = new ArrayList<>();
        int solution = 1;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int prod = i * j;
                if (prod == reverse(prod)) {
                    palin.add(prod);
                    for (int k = 0; k<palin.size()-1;k++){
                                    for(int l = 0; l<palin.size()-1;l++){
                                    int n = palin.get(l);
                                    int n1 = palin.get(l+1);
                                    if (n>n1){
                                            palin.remove(l);
                                            palin.add(l,n1);
                                            palin.remove(l+1);
                                            palin.add(l+1,n);
                                        }
                }
            }
        }}}
        solution = palin.get(palin.size()-1);
        return solution;
    }
    public static int reverse(int number){
        ArrayList<Integer> reverse = new ArrayList<>();
        for(int i = 10; i <= number*10;i*=10){
            int n = (number%i)/(i/10);
            reverse.add(n);
        }
        int reversee = 0;
        int k = reverse.size(); int j = 10;
           while(k > 0) {
            reversee+=(reverse.get(k-1)*j);
               j*=10;
               k--;
        }
        return reversee/10;
}}