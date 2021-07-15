package com.example.springdesignpattern.adapter;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class EnumerationIteratorTest {

    @Test
    public void hasNextTest() {
        List<String> list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        Iterator<String> enumerationIterator = new EnumerationIterator(Collections.enumeration(list));
        while(enumerationIterator.hasNext()) {
            System.out.println(enumerationIterator.next());
        }

    }

}