/*
Reverse a singly linked list.

*/

public class reverseList {
    ListNode current = head;
    ListNode prev = null;

    while(current!=null)
    {
        ListNode next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }

    return prev;
}}