/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.LinkedList;

public class Main
{
    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        MyLinkedList lin = new MyLinkedList();
        lin.add(33);
        
        lin.add("String");
        a.add(33);
        a.add("test");
        System.out.println(a);
        System.out.println(a.element());
        System.out.println(a.get(1));
        System.out.println(lin);
        System.out.println(lin.element());
        System.out.println(lin.get(1));
    }
}
class MyLinkedList<T> {
    Node head;
    int size;

    class Node {
        T data;
        Node next;

        Node(T d) {
            data = d;
        }
    }
    
    

    public  MyLinkedList<T> add(T data) {
        size++;
        Node newNode = new Node(data);
        newNode.next = null;
        if (head == null) {
            head = newNode;
            return this;
        } else {
            Node tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = newNode;
            return this;
        }
    }

    public T remove() {
        size--;
        T removed;
        if (head.next == null) {
            removed = head.data;
            head = null;
            return removed;
        } else {
            Node currentNode = head.next;
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }
            removed = currentNode.next.data;
            currentNode.next = null;
            return removed;
        }
    }

    public T remove(int position) {
        if (position >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node currentNode = head;
        for (int i = 0; currentNode != null && i < position - 1; i++) {
            currentNode = currentNode.next;
        }
        T removed = currentNode.next.data;
        Node next = currentNode.next.next;
        currentNode.next = next;
        return removed;
    }

    public int size() {
        return size;
    }

    public boolean contains(T data) {
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            if (currentNode.data == data)
                return true;
        }
        return false;
    }
    
    public String toString() {
        String s = "[";
        Node currentNode = head;
        while (currentNode != null) {
            s += currentNode.data.toString();
            currentNode = currentNode.next;
            if (currentNode != null)
                s +=  ", ";
        }
        s += "]";
        return s;
    }    
    public T element() {
        Node currentNode = head;
        T t;
        t = currentNode.data; 
        currentNode = currentNode.next;
        return t;
    }
    
    
    public T get(int index) {
        Node currentNode = head;
        int i = 0;
        while(currentNode.next != null){
            if (i == index)
                return currentNode.data; 
            currentNode = currentNode.next;
            i++;
        }
        return null;
    }
    
    
}