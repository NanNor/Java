package Sonntag;

public class AA {
    public static double add(double a, double b){
        return a+b;
    }
    public boolean checkUpDown(float[] a){
        for(int i = 1; i < a.length-1;i+=2){
            if(a[i] < a[i+2] || a[i-1] > a[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        byte a = (byte) 100;
        float b = 2.3f;
        System.out.println("a + b - 5 = " + (AA.add(a, b) - 5));
        System.out.println("7.5   + c = " + AA.add(7.5, b));
    }
}
