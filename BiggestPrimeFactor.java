import java.util.ArrayList;

/**
 * Created by hepstev on 07.12.15.
 */
public class BiggestPrimeFactor {
    public static void main(String[] args){

    System.out.println("-------------- divide able by --------------");
        ArrayList<Long> primefactors = new ArrayList<>();
        long x = 600851475143L;
        for(long x2 = 2; x2<x/2;x2++){
           if(x%x2 == 0){
               System.out.println(x2);
               primefactors.add(x2);
               for(long x3 = x2-1;x3 >1; x3--){
                   if(x2% x3 == 0) {
                       x2 = x;
                   }
               }
           }
        }
        long n = 1;
        System.out.println("------------- factorized -------------");
                for(int i = 0; i<primefactors.size();i++){
                   n*= primefactors.get(i);
                    if (n == x){
                        for(int i2 = 0; i2 <=(primefactors.size()-(primefactors.size()-i));i2++) {
                            System.out.print(primefactors.get(i2)+" * ");
                            if (i2 == (primefactors.size() - (primefactors.size() - i))) {
                                System.out.println(" 1 = "+n);
                            }
                        }
                    }
                }
        }
    }
