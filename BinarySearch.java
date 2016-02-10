import java.util.ArrayList;
import java.util.Random;

/**
 * Created by hepstev on 25.01.16.
 */
public class BinarySearch {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        for(int n = 0; n<10;n++){
            Random rnd = new Random();
            int a = rnd.nextInt(50);
            list.add(a);
        }
        System.out.println(list);
        search(list, 9);
    }
    public static long search(ArrayList n, int m){
        int number = 0;
        while(number<n.size()){
        }
        return 0;
}}
