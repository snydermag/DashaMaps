package com.github.zipcodewilmington.mylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void add() {
        // Given
        MyLinkedList list = new MyLinkedList("manny");
        String expectedKey = "brent";
        Integer expectedValue = 6;
        MyNode expected = new MyNode(expectedKey, expectedValue);

        // When
        list.add(expectedKey, expectedValue);
        MyNode actual = list.getHead().getNext();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remove() {
    }

    @Test
    public void size() {
        // Given
        int expected = 1;
        MyLinkedList list = new MyLinkedList("manny");
        list.add("brent", 6);

        // When
        int actual = list.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet(){
        // Given
        MyLinkedList list = new MyLinkedList("manny");
        String expectedKey = "brent";
        Integer expectedValue = 6;
        MyNode expected = new MyNode(expectedKey, expectedValue);
        list.add(expectedKey, expectedValue);

        // When

        MyNode actual = list.get(expectedKey);

        // Then
        Assert.assertEquals(expected, actual);
    }
}