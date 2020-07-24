/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

*/


var addTwoNumbers = function (l1, l2) {
    const head = new ListNode();
    let current = head;
    let carry = 0;

    while (l1 || l2 || carry) {
        current.next = new ListNode();
        current = current.next;
        let val = (l1 ? l1.val : 0) + (l2 ? l2.val : 0) + carry;
        carry = val >= 10 ? 1 : 0;
        current.val = val % 10;
        l1 = l1 ? l1.next : null;
        l2 = l2 ? l2.next : null;
    }

    return head.next;
};