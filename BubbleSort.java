import java.util.ArrayList;
import java.util.Random;

/**
 * Created by nano on 03.11.15.
 */
public class BubbleSort {
    public static void main(String[] args){
        String bunchOfWords = "Read the file";
        char[] charArray2 = bunchOfWords.toCharArray();
        for(int i = 0; i < charArray2.length; i++){
            System.out.println((int)charArray2[i]);
        }
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        int size = 10;
        for(int i = 0; i < size ; i++){
            Random rand = new Random();
            int randomNumber = rand.nextInt(100);
            tmp.add(randomNumber);
        }
        System.out.println(tmp);
        for (int i = 0; i<size-1;i++){
            for(int j = 0; j<size-1;j++){
        int n = tmp.get(j);
        int n1 = tmp.get(j+1);
        if (n>n1){
            tmp.remove(j);
            tmp.add(j,n1);
            tmp.remove(j+1);
            tmp.add(j+1,n);
        }
            }
        }
        System.out.println(tmp);
    }
}
