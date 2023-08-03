package com.github.zipcodewilmington.mylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyNodeTest {



    @Test
    public void testSetNext() {
        // Given
        MyNode first = new MyNode("Dolio", 1);
        MyNode second = new MyNode("Kris", 3);

        // When
        first.setNext(second);

        // Then
        Assert.assertEquals(second, first.getNext());
    }

    @Test
    public void testEquals() {
        // Given
        MyNode first = new MyNode("Dolio", 1);
        MyNode second = new MyNode("Dolio", 1);

        // Then
        Assert.assertEquals(first, second);
    }
}