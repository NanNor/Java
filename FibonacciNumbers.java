/**
 * Created by hepstev on 04.12.15.
 */
public class FibonacciNumbers {
    public static void main(String[] args){
    int Fn1 = 1;
    int Fn2 = 1;
        int mill = 4000000;
        int SumFn = 0;
        while (Fn2 < mill/2) {
            int Fn = Fn1 + Fn2;
            System.out.println(Fn);
            if(Fn%2 == 0 && SumFn < mill){
                SumFn+= Fn;
            }
            Fn1 = Fn2;
            Fn2 = Fn;
        }
        System.out.println("Sum of Fn "+ SumFn);
    }
}
