package Sonntag;

public class Exceptions extends Throwable {
    void a() throws Exception{
         new UnsupportedOperationException("Geht nicht!");
    }
    void b() throws Exception {
        a();
    }
}
