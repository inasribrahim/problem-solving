package org.example.linked_list;

public class LinkedList {

    Node head ;

    public LinkedList(Node head) {
        this.head = head; // first node
    }

    public void add(Node newNode){ //O(1)
        newNode.next = head;
        head = newNode;
    }

    public void delete(){ //O(1)
        head = head.next;
    }

    public void display(){
        Node n  = head;
        while (n != null){
            System.out.println(n.value);
            n = n.next;
        }
    }
    public void sort() {
        Node current = head, index = null;

        int temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.value > index.value) {
                        temp = current.value;
                        current.value = index.value;
                        index.value = temp;
                    }

                    index = index.next;
                }
                current = current.next;
            }

        }
    }
}
