import java.util.HashMap;
import java.util.Map;

/**
 * Created by hepstev on 05.01.16.
 */
public class ReciprocalCycles {
    public static void main(String[] args) {
        int valueOfd = 0;
        int length = 0;
        for (int i = 1; i <= 1000; i++) {
            int len = getCycleLength(i);
            if (len > length) {
                valueOfd = i;
                length = len;
            }
        }
        System.out.println(valueOfd);
    }

    private static int getCycleLength(int n) {
        Map<Integer,Integer> stateToIter = new HashMap<>();
        int state = 1;
        int iter = 0;
        while (!stateToIter.containsKey(state)) {
            stateToIter.put(state, iter);
            state = state * 10 % n;
            iter++;
        }
        return iter - stateToIter.get(state);
    }
}

