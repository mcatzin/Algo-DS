var sortList = function (head) {
    if (head === null || head.next === null) {
        return head;
    }

    let fast = head;
    let slow = head;

    while (fast !== null && fast.next !== null) {
        fast = fast.next.next;
        slow = slow.next;
    }
    const mid = slow.next;
    slow.next = null;
    let left = sortList(head);
    let rigth = sortList(mid);

    const dummy = new ListNode(0);
    let h = dummy;

    while (left !== null && right !== null) {
        if (left.val < rigth.val) {
            h.next = left;
            left = left.next;
        } else {
            h.next = right;
            right = right.next;
        }
        h = h.next;
    }

    if (left) {
        h.next = left;
    }

    if (rigth) {
        h.next = right;
    }

    return dummy.next;
};