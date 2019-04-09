package com.mySetTests;

import org.junit.Assert;
import org.junit.Test;

import com.mySet.CustomSet;

import static org.junit.Assert.assertEquals;

public class TestSet {

    @Test
    public void isEmpty(){
        CustomSet<Integer> set = new CustomSet<>();
        assertEquals(true, set.isEmpty());

        set.add(1);
        assertEquals(false, set.isEmpty());
    }

    //test that the Integer elements are getting added to the set
    @Test
    public void testMySetAddInteger() {
        CustomSet<Integer> set = new CustomSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(4);
        Assert.assertEquals(true, set.contains(3));
        Assert.assertEquals(true, set.contains(1));
        Assert.assertEquals(false, set.contains(5));
        Assert.assertEquals(4, set.size());
    }

    //test that the String elements are getting added to the set
    @Test
    public void testSetAddString() {
        CustomSet<String> set = new CustomSet<>();
        set.add("hello");
        set.add("world");
        set.add("hi");
        set.add("hello");
        set.add("hi");
        set.add("goodbye");
        Assert.assertEquals(true, set.contains("world"));
        Assert.assertEquals(4, set.size());
    }

    @Test
    public void testIfListSizeIsIncrementing(){
        CustomSet<Integer> set = new CustomSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(1);

        Assert.assertEquals(14, set.size());
    }


    @Test
    public void testSetContains(){
        CustomSet<Integer> set = new CustomSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        Assert.assertEquals(true, set.contains(2));
    }


    //test if elements are getting removed from the list at the specified index
    @Test
    public void testSetRemove(){
        CustomSet<Integer> list = new CustomSet<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(0);
        list.remove(2);

        Assert.assertEquals(1, list.size());
        Assert.assertEquals(2, list.remove(1));
    }

    //check trim to size
    @Test
    public void testSetClear(){
        CustomSet<Integer> list = new CustomSet<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.clear();

        Assert.assertEquals(0, list.size());

        list.add(1);
        list.add(2);
        list.add(3);

        Assert.assertEquals(3, list.size());
    }
}
