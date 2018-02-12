package Sonntag;

import java.util.ArrayList;
import java.util.List;

public class Set {
    List<Object> elements;
    Set(){
        this.elements = new ArrayList<Object>();
    }
    boolean contains(Object element){
        return elements.contains(element);
    }
    void insert(Object element) throws Exceptions
    {
        if(!contains(element)){
            elements.add(element);
        }
    }
}
