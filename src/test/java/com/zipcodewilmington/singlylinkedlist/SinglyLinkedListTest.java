package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addTest() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        String expectedList = "1 2 3";
        String actualList = list.toString();

        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void removeTest() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        String expectedList = "1 2";
        list.remove(2);

        Assert.assertEquals(expectedList, list.toString());
    }

    @Test
    public void containsTest1() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Assert.assertTrue(list.contains(2));
    }

    @Test
    public void containsTest2() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Assert.assertFalse(list.contains(4));
    }

    @Test
    public void findTest1() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Integer expectedIndex = 1;
        Integer actualIndex = list.find(2);

        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void findTest2() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Integer expectedIndex = -1;
        Integer actualIndex = list.find(4);

        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void sizeTest() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Integer expectedSize = 3;
        Integer actualSize = list.size();

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void getTest() {}

    @Test
    public void copyTest() {}

    @Test
    public void sortTest() {}

    @Test
    public void reverseTest() {}

    @Test
    public void sliceTest() {}
}
