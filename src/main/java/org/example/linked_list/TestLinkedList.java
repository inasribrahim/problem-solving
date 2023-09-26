package org.example.linked_list;

public class TestLinkedList {
    public static void main(String[] args){
        LinkedList ls = new LinkedList( new Node(12,null));
        ls.add(new Node(77,null));
        ls.add(new Node(65,null));

        ls.display();
        ls.sort();
        System.out.println("data sorted ------------------------");
        ls.display();
    }
}
