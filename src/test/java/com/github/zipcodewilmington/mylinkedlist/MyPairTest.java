package com.github.zipcodewilmington.mylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyPairTest {

    @Test
    public void testSetKey() {
        // Given
        String expected = "pain";
        MyPair pair = new MyPair("no", 3);


        // When
        pair.setKey("pain");
        String actual = pair.getKey();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetValue() {
        // Given
        Integer expected = 19;
        MyPair pair = new MyPair("no", 3);


        // When
        pair.setValue(19);
        Integer actual = pair.getValue();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEquals() {
        // Given
        MyPair first = new MyPair("no", 1);
        MyPair second = new MyPair("no", 1);

        // Then
        Assert.assertEquals(first, second);
    }
}