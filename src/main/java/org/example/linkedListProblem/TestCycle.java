package org.example.linkedListProblem;

public class TestCycle {
    public static void main(String[] args){
        ListNode Lst = new ListNode(3);

    }
    public static boolean isCycle(ListNode head){
                ListNode current = head ;
                boolean flag = false;
                if(current.next == null){
                    flag = false;
                }
                else {
                    flag = true;
                }
                return flag;
    }
}
