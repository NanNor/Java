import java.util.ArrayList;

/**
 * Created by nano on 03.11.15.
 */
public class MinSort {
    public static void main(String[] args) {
    int[][] a = { {0},
            {1,2},
            {3,4,5},
            {6,7,8,9}};
        for(int i=0; i<a.length;++i){
            for(int j=0;j<a[i].length;++j){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
