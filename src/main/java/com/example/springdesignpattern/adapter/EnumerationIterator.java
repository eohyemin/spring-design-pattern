package com.example.springdesignpattern.adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class EnumerationIterator implements Iterator<String> {
    Enumeration<String> enumeration;

    public EnumerationIterator(Enumeration<String> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public void remove() {
        throw new NoSuchElementException();
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public String next() {
        return enumeration.nextElement();
    }
}
