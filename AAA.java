package Sonntag;

interface B {
    double a(int value);
}
abstract class AAA implements B{
    protected
    abstract
    int b(int value);
    public
    final
    double a(int value){
        return b(value);
    }
}
class C extends AAA implements B {


    @Override
    protected int b(int value) {
        return 0;
    }
}
