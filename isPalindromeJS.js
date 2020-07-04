// Given a singly linked list, determine if it is a palindrome.

// Example 1:

// Input: 1->2
// Output: false
var isPalindrome = function (head) {
    if (head == null || head.next == null) return null;

    let slow = head;
    let fast = head;

    while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    slow.next = reverse(slow.next);
    slow = slow.next;
    while (slow != null) {
        if (head.val != slow.val) return false;
        slow = slow.next;
        head.next;
    }

}