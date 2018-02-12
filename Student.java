package Sonntag;

public class Student {
    String vorname;
    String nachname;
    int matrikelnr;
    public Student(String vorname, String nachname, int matrikelnr){
        this.vorname = vorname;
        this.nachname = nachname;
        this.matrikelnr = matrikelnr;
    }

    @Override
    public String toString() {
        return "Vorname: "+vorname+", Nachname: "+nachname+", Matrikelnummer: "+matrikelnr;
    }
}
class Testing{
    public static void main(String[] args){
        System.out.println(new Student("Thomas","Müller",123456));
        System.out.println(new Student("Kai","Otto",654321));
    }
}
