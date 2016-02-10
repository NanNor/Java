import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hepstev on 09.02.16.
 */
public class mWaySearch {
    public static void Print(Object ob){
        System.out.println(ob);
    }
    public static void main(String[] args){
        int[][] keys = new int[4]/*anzahl der db*/[3]/*anzahl der ds*/;
        keys[0][0] = 7;
        keys[0][1] = 9;
        keys[0][2] = 20;
        keys[1][0] = 25;
        keys[1][1] = 27;
        keys[1][2] = 32;
        keys[2][0] = 44;
        keys[2][1] = 57;
        keys[2][2] = 69;
        keys[3][0] = 84;
        keys[3][1] = 84;
        keys[3][2] = 84;
        ArrayList<Integer> searchKeys = new ArrayList<>();
        for(int p=0; p<keys.length;p++){
            for(int q=0;q<keys.length-1;q++){
                searchKeys.add(keys[p][q]);
            }
        }
        Set<Integer> toSearch = new HashSet<>();
        toSearch.addAll(searchKeys);
        searchKeys.clear();
        searchKeys.addAll(toSearch); //duplizierungen entfernt
        ArrayList<Integer> compares = new ArrayList<>();
        for(int g = 0; g < searchKeys.size();g++){
            int search = searchKeys.get(g);
            int c = 1;
        for(int i = 0; i<keys.length;i++,c++){
                if(search <= keys[i][keys.length-2]){
                    for(int j = 0; j<keys.length-1;j++,c++){
                        if(search == keys[i][j]){
                            c++;
                            compares.add(c);
                            i = keys.length;
                            j = keys.length;
                        }

                    }
                }
        }}
        int sum = 0;
        for(int h=0; h<compares.size();h++){
            sum+=compares.get(h);
        }
        double averageCompares = (double)sum/searchKeys.size();
        Print(averageCompares);
    }
}
