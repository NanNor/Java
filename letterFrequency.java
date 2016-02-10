import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by hepstev on 01.12.15.
 */
public class letterFrequency {
    static BufferedReader bufferedReader;
    public static void main(String[] args) throws IOException {
            Testing();
        int a = 0;int b = 0;
        for (int i = 0; i< 10; i++){
            System.out.print(a+""+b+" ");
            a++;

    }
        System.out.println();
        a = 0;
        for(int p = 0; p< 10; p++){
            System.out.print(a+""+b+" ");
            b++;
        }
    }

    public static byte[] cipherInstanceTwo(byte[] data, byte[] key) throws BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, NoSuchAlgorithmException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, "DSS");
        Cipher cipherInstance = null; //Password based encryption
        try {
            cipherInstance = Cipher.getInstance("AES/ECB/PKCS5Padding");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            System.err.println("No Algorithm exception");
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
            System.err.println("No Padding used. Password based encryption #5");
        }
        try {
            cipherInstance.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
            System.err.println("Invalid key used");
        }
        try {
            return cipherInstance.doFinal(data);
        } catch (IllegalBlockSizeException e) {
            System.err.println("Wrong block size used for AES. AES block size should be 128bit");
        } catch (BadPaddingException e) {
            e.printStackTrace();
            System.err.println("Bad padding used for encryption! Should used PKCS5Padding for" +
                    "Password based encryption or PKCS1Padding for RSA");
            Cipher instance = Cipher.getInstance("AES/CBC/NoPadding");
                    if (instance.equals("AES/ECB/PKSC5Padding")){
                        System.err.println("Wrong Padding");
                    }
        }
        return cipherInstance.doFinal(data);
    }
    public static byte[] CiperInstance(byte[] data, byte[] key) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        SecretKeySpec skeySpec = new SecretKeySpec(key, "AES");
        Cipher cipherInstance = Cipher.getInstance("AES/CBC/NoPadding");
        cipherInstance.init(Cipher.DECRYPT_MODE, skeySpec);
        return cipherInstance.doFinal(data);
    }
        public static void Testing() throws IOException {
        ArrayList<String> newLetterList = new ArrayList<>();
        for (int i = 0; i < 119; i++) {
            newLetterList.add((char) i + "    " + i);
        }
        ArrayList<Integer> newIntegerList = new ArrayList<>();

        System.out.println(newLetterList);
        FileReader fileReader = new FileReader("/home/hepstev/Schreibtisch/Files/PGP/key");
        bufferedReader = new BufferedReader(fileReader);
        String fileLineOne = bufferedReader.readLine();
        char[] letterFrequency = fileLineOne.toCharArray();
        for(int i = 0; i< letterFrequency.length; i++){
            int letterFr;
            for(int lp = 0; lp<letterFrequency.length;lp++){
                for(int j= 0; j<letterFrequency.length;j++) {
                    int n = letterFrequency[j];
                    int n1 = letterFrequency[j];
                    if(n>n1){
                        n1 = letterFrequency[j];
                        n = letterFrequency[j+1];
                        letterFr = n1;
                        newIntegerList.add(letterFr);
                        letterFr = n;
                        newIntegerList.add(letterFr);
                    }
                }
            }
        }
        ArrayList<Integer> tmeeep = new ArrayList<>();
        int size = 10;
        for(int i = 0; i < size; i++) {
            Random rand = new Random();
            int randomNumber = rand.nextInt(100);
            tmeeep.add(randomNumber);
        }

        System.out.println(tmeeep);
        System.out.println(newIntegerList);

        FileReader fileReader2 = new FileReader("/home/hepstev/Schreibtisch/Files/PGP/key");
        bufferedReader = new BufferedReader(fileReader2);
        String fileLineOne2 = bufferedReader.readLine();
        fileReader.close();
        String[] keys = fileLineOne2.split(" ");
        for(int po = 0; po < keys.length; po++){
            if (keys[po].equals("FB496156")){
                System.out.println(true);
                System.out.println("FB496156");
            }
            else {
                System.err.println("key is wrong");
            }
        }

        System.out.println("five modulo seven "+5%7);
        for(int gr = 1; gr < 10; gr++){
            int fx = (int)Math.pow(gr,gr);
            System.out.println(fx);}
        int count = 0;
        byte[] data;
        for (int kh = 0; kh < 10; kh++){
        }
        for (String key: keys){
            if (key == null || key.length() == 0){
                System.err.println("Doesn't work!");
            }
            count++;
            int keylength = key.length();
            System.out.println(keylength + " This is the key " + key);
        }
    }

}
