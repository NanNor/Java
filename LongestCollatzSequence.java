/**
 * Created by hepstev on 15.12.15.
 */
public class LongestCollatzSequence {
    /* n -> n/2 (n is even)
       n -> 3n+1(n is odd)*/
    public static void main(String[] args) {
        final int number = 1000000;

        long sequenceLength = 0;
        long startingNumber = 0;
        long sequence;

        for (int i = 2; i <= number; i++) {
            int length = 1;
            sequence = i;
            while (sequence != 1) {
                if ((sequence % 2) == 0) {
                    sequence = sequence / 2;
                } else {
                    sequence = sequence * 3 + 1;
                }
                length++;
            }

            if (length > sequenceLength) {
                sequenceLength = length;
                System.out.println(length+" and this "+i);
                startingNumber = i;
            }
        }}}
