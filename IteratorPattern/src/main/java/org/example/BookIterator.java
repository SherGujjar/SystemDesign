package org.example;

import java.util.List;

public class BookIterator implements Iterator{

    private List<Book> book;
    private int idx = 0;

    public BookIterator(List<Book> book){
        this.book = book;
    }

    @Override
    public boolean hasNext() {
        return idx<book.size();
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return book.get(idx++);
        }
        return null;
    }
}
