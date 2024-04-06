package org.example.IteratorAndEnumeration;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

public class EnemurationIteratorAdapter implements Iterator {

    Enumeration enumeration;

    public EnemurationIteratorAdapter(Enumeration enumeration){
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
       return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }


}
