package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;
import java.util.LinkedList;

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
    public void getTest() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Integer expectedGet = 2;
        Integer actualGet = list.get(1);

        Assert.assertEquals(expectedGet, actualGet);
    }

    @Test
    public void copyTest() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        String expectedList = "1 2 3";
        String actualList = list.copy().toString();

        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void sortTest() {
        Comparator<Integer> comparator = Comparator.naturalOrder();
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(7);
        list.add(12);

        list.sort(comparator);
        String expectedList = "2 5 7 9 12";
        String actualList = list.toString();

        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void reverseTest() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.reverse();
        String expectedList = "3 2 1";
        String actualList = list.toString();

        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void sliceTest() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        String expectedList = "2 3 4";
        String actualList = list.sliced(1, 4).toString();

        Assert.assertEquals(expectedList, actualList);
    }
}
