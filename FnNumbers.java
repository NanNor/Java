/**
 * Created by hepstev on 21.12.15.
 */
public class FnNumbers {
    public static void main(String[] args){
        double rootOfFive = Math.sqrt(5);
        double phi = (rootOfFive+1)/2;
        for(double x = 1; x <= 40; x++){ // First Fn(x)
            double underpath = Math.pow(phi, x);
            double Fn = underpath/rootOfFive;
            if(x%2 == 0){
                double Fnf = Math.floor(Fn);
                System.out.println("Fn("+(int)x+")="+(int)Fnf);
            }
            else {
                double Fnc = Math.ceil(Fn);
                System.out.println("Fn("+(int)x+")="+(int)Fnc);
            }
        }
    }
}
