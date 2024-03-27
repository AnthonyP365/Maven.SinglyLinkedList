package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
//  Inner class representing individual nodes in the linked list
    private static class Node<T> {
//      Stores the value of the node
        T data;
//      A reference to the next node in the linked list
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

//  Represents the starting point of the linked list. Stores a reference to the first node
    private Node<T> head;

//  Initializes the head pointer to null, indicating that the linked list starts as empty
    public SinglyLinkedList() {
        this.head = null;
    }

    public void add(T data) {
        Node<T> node = new Node<>(data); // Create a new node with the given data
        if (head == null) {
            head = node; // If the list is empty, make the new node the head of the list
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next; // Move the next node until the last node is reached
            }
            current.next = node; // Set the next pointer of the last node to the new node
        }
    }

    public void remove(int index) {
        Node<T> current = head;
        Node<T> previous = null;

        if (index == 0) {
            head = current.next; // If index is 0, moves the head to next link
        } else if (index > 0) {
            int currentIndex = 0;
            while (current != null && currentIndex < index) { // iterates through the list until it lands on the index
                previous = current;
                current = current.next;
                currentIndex++;
            }
            previous.next = current.next; // Skips (deletes) the data at the index
        }
    }

    public Boolean contains(T data) {
        boolean result = false;
        Node<T> current = head;

        while (current != null) {
            if (current.data.equals(data)) {
                result = true;
            }
            current = current.next;
        }
        return result;
    }

    public Integer find(T data) {
        int index = 0;
        Node<T> current = head;

        while (current != null) {
            if (current.data.equals(data)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public Integer size() {
        int size = 1;
        Node<T> current = head;

        while (current != null) {
            if (current.next == null) {
                return size;
            } else {
                size++;
                current = current.next;
            }
        }
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;

        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        return sb.toString().trim();
    }
}
