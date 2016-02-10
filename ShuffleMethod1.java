import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by hepstev on 11.01.16.
 */
public class ShuffleMethod1 {
    static int nTwo = 90; // the number of elements to shuffle
    public static void print(Object ob){
        System.out.println(ob);
    }
    public static void main(String[] args){
        int[] firstHalf = new int[nTwo/2];
        int[] secondHalf = new int[nTwo/2];
    ArrayList<Integer> numbers = new ArrayList<>();
    for(int nu = 1; nu <= nTwo+1 ; nu++){ // ntwo+1 numbers put in
        numbers.add(nu);
        }
        if(nTwo%2 == 0 && numbers.size() == nTwo+1){
            numbers.remove(nTwo);
            print("unshuffled list of numbers "+numbers);
            for(int location = 0; location < nTwo/2;location++){
                firstHalf[location] = numbers.get(location); // fill in the first half
            }
            for(int location2 = 0, getNumber = nTwo/2; location2 < nTwo/2; location2++, getNumber++){
                secondHalf[location2] = numbers.get(getNumber); // fill in the second half
            }
        }
        shuffleArray(firstHalf);
        shuffleArray(secondHalf);
        Collections.shuffle(numbers); //Collections method used for shuffle
        print("");
        print("shuffled with collections method "+numbers);
        numbers.clear();
        for(int i = 0; i< nTwo/2; i++){
            numbers.add(firstHalf[i]);
            numbers.add(secondHalf[i]);
        }
        print("");
        print("sorted list of numbers with shuffle method "+numbers);
    }
    static void shuffleArray(int[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}
