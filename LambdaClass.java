package Sonntag;

public class LambdaClass {
    Predicable<Integer> evenNumber = i -> i%2 == 0;
    Predicable<String> containsA = i -> i.contains("a");
}
interface Predicable<T>{
    boolean eval(T t);
}
