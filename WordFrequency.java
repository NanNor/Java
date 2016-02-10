import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Created by nano on 17.11.15.
 */
public class WordFrequency {
    static BufferedReader bufferedReader;
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> WordCount = new ArrayList<>();
        ArrayList<String> Words = new ArrayList<>();
        String bunchOfWords = "Read the file";
        char[] charArray2 = bunchOfWords.toCharArray();
        for(int i = 0; i < charArray2.length; i++){
            System.out.println(charArray2[i]);
        }
        FileReader fileReader = new FileReader("/home/hepstev/Dokumente/RandomText");
        bufferedReader = new BufferedReader(fileReader);
        String fileLineOne = bufferedReader.readLine();
        String fileLineTwo;
        while ((fileLineTwo = bufferedReader.readLine()) != null) {
            fileLineOne += fileLineTwo;
        }
        fileReader.close();
        String[] keys = fileLineOne.split(" ");
        String[] uniqueKeys;
       int count = 0;
        uniqueKeys = getUniqueKeys(keys);
        for (String key : uniqueKeys) {
            if (key == null || key.length() == 0) {
                break;
            }
            for (String s : keys) {
                if (key.equals(s)) {
                    count++;
                }
            }
            WordCount.add(count);
            Words.add(key);
            count = 0;
        }

        for (int i = 0; i < WordCount.size() - 1; i++) {
            for (int j = 0; j < WordCount.size() - 1; j++) {
                String nn = Words.get(j);
                String nn1 = Words.get(j+1);
                int n = WordCount.get(j);
                int n1 =  WordCount.get(j + 1);
                if (n > n1) {
                    WordCount.remove(j);
                    Words.remove(j);
                    WordCount.add(j, n1);
                    Words.add(j, nn1);
                    WordCount.remove(j + 1);
                    Words.remove(j+1);
                    WordCount.add(j + 1, n);
                    Words.add(j+1, nn);;
                }
            }
        }
        for (int i = WordCount.size()-1; i>0 ;i-- ){
            int container = WordCount.get(i);
            String MentionedWord = Words.get(i);
            System.out.println(container+"  "+MentionedWord);
        }
                }
    private static String[] getUniqueKeys(String[] keys)
    {
        String[] uniqueKeys = new String[keys.length];

        uniqueKeys[0] = keys[0];
        int uniqueKeyIndex = 1;
        boolean keyAlreadyExists = false;

        for(int i=1; i<keys.length ; i++)
        {
            for(int j=0; j<=uniqueKeyIndex; j++)
            {
                if(keys[i].equals(uniqueKeys[j]))
                {
                    keyAlreadyExists = true;
                }
            }

            if(!keyAlreadyExists)
            {
                uniqueKeys[uniqueKeyIndex] = keys[i];
                uniqueKeyIndex++;
            }
            keyAlreadyExists = false;
        }
        return uniqueKeys;
    }
}

