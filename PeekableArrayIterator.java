package Sonntag;

public class PeekableArrayIterator implements Iterator<Object>, Peekable<Object> {

    int counter = 0;
    Object[] array;
    public PeekableArrayIterator(int length){
        array = new Object[length];
    }
    @Override
    public Object peek() {
        return array[counter];
    }

    @Override
    public boolean hasNext() {
        return counter < array.length;
    }

    @Override
    public Object next() {
        int tmp = counter;
        counter++;
        return array[tmp];
    }
}
interface
Peekable<T>{
    /**
     *
     Gibt das nächste Element zurück
     ,
     ohne es zu entfernen.
     */
    T peek();
}
interface Iterator<T>{
/**
 * Gibt true zurück, wenn
 weitere Elemente vorhanden sind, sonst false
 */
        boolean hasNext();
/**
 * Gibt das nächste Element der Iteration zurück.
 */
        T next();
        }