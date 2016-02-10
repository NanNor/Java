import java.util.Arrays;

/**
 * Created by hepstev on 04.01.16.
 */
public class LexicographicPermutation {
    public static void main(String [] args) {
        LexicographicPermutation l = new LexicographicPermutation(10);
        l.PermArray(10);
        // What is the 1000000. lexicographic permutation of the digits 0,1,2,3,4,5,6,7,8 and 9?
        System.out.println(l.findPartPermutationArray(1000000));
    }
    private String[] permArray;
    private int checkNum;

    public LexicographicPermutation(int n) {
        checkNum = n;
        permArray = new String[calculatePermutations(n, n)];
    }

    public String findPartPermutationArray(int i) {
        return permArray[i - 1];
    }

    private int calculatePermutations(int n, int r) {
        return (calculateFactorial(n)/(calculateFactorial((n - r))));
    }

    private int calculateFactorial(int n) {
        int factorial = 1;
        for(int i = n; i > 0; i--) {
            factorial = (i * factorial);
        }
        return factorial;
    }

    public void PermArray(int n) {
        int counter = 0;
        long x = (long) Math.pow(10, n);
        for(long i = (long) Math.pow(10, (n - 2)); i < x; i++) {
            if(checkLexiographic(i)) {
                permArray[counter] = setStringFormat(i);
                counter++;
            }
        }
        sortPermutationArray();
    }

    private void sortPermutationArray() {
        Arrays.sort(permArray);
    }
    private boolean checkLexiographic(long n) {
        char[] check;
        if(DigitTotal(n) != 45) {
            return false; }
        check = setStringFormat(n).toCharArray();
        Arrays.sort(check);

        for(int i = 0; i < check.length - 1; i++) {
            if(check[i] == check[i + 1])
                return false;
        }
        return true;
    }

    private String setStringFormat(long n) {
        String returnToString= "redundant"; //not important what is written here
        if(Long.toString(n).length() < checkNum) {
            returnToString = "0" + Long.toString(n);
        }
        else {
            returnToString = Long.toString(n);
        }
        return returnToString;
    }

    private int DigitTotal(long n) {
        int total = 0;

        char[] charArray = Long.toString(n).toCharArray();

        for(char x : charArray) {
            total += (x - 48);
        }
        return total;
    }
}