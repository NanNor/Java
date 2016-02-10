import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by hepstev on 09.02.16.
 */
public class LineareSuche {
    public static Set<Integer> set = new HashSet<>();
    public static int linearSearch(int n, int m[]){
     int count = 0;
        for(int i = 0; i < m.length;i++){
         if (n == m[i]){
             count++;
         }
     }
        if(count > 10){
            int qr = 0;
            while (qr < 5000) {
                System.out.println("found the number 30 " + count + " times  -------------------");
            qr++;
            }
        }
        set.add(count);
        print("found 30 "+count+" times");
    return n;}
    public static int mWaySearch(ArrayList n){
        if(n.size()%4 == 0){
        int divide = n.size()/4;
        int[][]keys = new int[n.size()/divide][divide];
            for(int i = 0; i < n.size(); i++){
                for(int j = 0; j < n.size();j++){
                    keys[i][j] = (int)n.get(j);
                }
            }
            Set<Integer> toSearch = new HashSet<>();
            toSearch.addAll(n);
            n.clear();
            n.addAll(toSearch);
            for(int g = 0; g < n.size(); g++){
                int search = (int)n.get(g);
                int c = 1;
                for(int i = 0; i < keys.length;i++,c++){
                    if(search <= keys[i][keys.length-2]){
                        for(int j = 0; j < keys.length-1;j++,c++){
                            if(search == keys[i][j]){
                                c++;
                                break;
                            }
                        }
                    }
                }
            }
    }
    public static ArrayList bubbleSort (ArrayList list){
        int size = list.size();
        for (int i = 0; i<size-1;i++){
            for(int j = 0; j<size-1;j++){
                int n = (int)list.get(j);
                int n1 = (int)list.get(j+1);
                if (n>n1){
                    list.remove(j);
                    list.add(j,n1);
                    list.remove(j+1);
                    list.add(j+1,n);
                }
    }
        }
        return list;
    }
    public static void print(Object ob){
        System.out.println(ob);
    }
    public static double average(ArrayList l, int m){
        return (double)m/l.size();
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for(int j = 0; j < 10000;j++) {
            for (int i = 0; i < 500; i++) {
                list.add(rnd.nextInt(500));
            }
            bubbleSort(list);
            int[] arr = list.stream().mapToInt(i -> i).toArray();
            linearSearch(50, arr);
            list.clear();
        }
        list.addAll(set);
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
        sum+= list.get(i);
        }
        double av = average(list,sum);
        print("this is the average number "+av); // the average is 2.5
    }}
