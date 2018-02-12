package StreamsUndIO.de.umr.oop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IOStreams {

    public static Stream<String> words(String filePath) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(filePath));
        Stream<String> fileStream = file.lines();
        Stream<String> strings = fileStream.map(x->x.split(" ")).flatMap(x-> Arrays.stream(x)).map(x-> clean(x));
        return strings;
    }

    public static String clean(String str){
        char pos = str.charAt(str.length()-1);
        if(!('A' <= pos && pos <= 'Z' || 'a' <= pos && pos <= 'z')){
            return str.substring(0,str.length()-1);
            }
            while (str.contains("’")) {
                str = str.substring(0, str.indexOf('’'));
            }
            while (str.contains("'")) {
                str = str.substring(0, str.indexOf("'"));
            }
        return str;
    }

    public static Stream<String> unifiy(Stream<String> str,final List<String> sl){
        for(int i=0; i < sl.size();i++){
            sl.set(i,sl.get(i).toUpperCase());
        }
        if(!sl.isEmpty()){
            str = unifiy(str,sl.subList(1,sl.size()));
            str = str.filter(x->!x.equals(sl.get(0)));
        }
        return str.map(x->x.toUpperCase());
    }

    public static Stream<Pair<String,Integer>> countWords( Stream<String> words ){
        Stream<Pair<String,Integer>> pairstr = new ArrayList<>((words.map(x->new Pair<>(x,1))
                .collect(Collectors.groupingBy(x->x.getFst())).values())).stream().map(x->new Pair<>(x.get(0).getFst(),x.size()));
        return pairstr;
    }

    public static Pair<String,Integer>[] getTopN(Stream<Pair<String,Integer>> str,int n){
        Pair<String,Integer>[] top = str.sorted((x,y)->y.getSnd()-x.getSnd()).toArray(x-> new Pair[x]);
        top = Arrays.copyOfRange(top,0,n);
        return top;
    }
}
