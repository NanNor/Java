package StreamsUndIO.de.umr.oop;

import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import static StreamsUndIO.de.umr.oop.IOStreams.*;

public class Test {
    public static void main(String[] args) throws IOException {
      List<String> ls = new LinkedList<>();
        ls.add("and");
        ls.add("or");
        ls.add("the");
        ls.add("in");

        Pair<String,Integer>[] top = getTopN(countWords(unifiy(words("text.txt"),ls)),10);
        System.out.println("Liste der 10 häufigsten Wörter");
         for(Pair<String,Integer> topTen : top){
            System.out.println(topTen);
        }

        System.out.println();
        System.out.println("Liste der Wörter alphabetisch"); // nur erster Buchstabe
        countWords(words("text.txt")).sorted(Comparator.comparingInt(x -> x.getFst()
                .charAt(0))).forEach(x->System.out.println(x));

    }
}
