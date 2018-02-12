package Sonntag;

public class Wochentag {
    public static void main(String[] args){
        switchDay('S');
        switchDay('T');
        switchDay('D');
        System.out.println("Bla"+2);
    }
    static void switchDay(char c){
        switch(c){
            case 'M':
                System.out.println("Montag");
                System.out.println("Mittwoch");
                break;
            case 'D':
                System.out.println("Dienstag");
                System.out.println("Donnerstag");
            case 'S':
                System.out.println("Samstag");
                System.out.println("Sonntag");
                break;
            default: System.out.println("Freitag");
        }
    }
}
