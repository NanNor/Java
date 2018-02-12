package Sonntag;

public class Test {
    public static void main(String[] args){
    String str0 = "Hello ";
    String str = "Hello world";
    String newString = str0+str;
    System.out.println(newString);
    System.out.println(shake(str));
    System.out.println(shake2(str));
    }
    static String shake(String str){
        String s = "";
        for(int i = 0, j = str.length()-1; i <= j;i++,j--){
            s = s + str.charAt(j)+str.charAt(i);
        }
        return s;
    }
    static String shake2(String str){
        String s = "";
        int i = 0;
        int j = str.length()-1;
        while(i <= j){
            s = s+str.charAt(j)+str.charAt(i);
            i++;
            j--;
        }
        return s;
    }
}
