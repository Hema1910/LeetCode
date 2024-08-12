public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) return null;

        // Create a dummy node to handle edge cases where m = 1
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Move the pointer to the node just before the m-th node
        ListNode prev = dummy;
        for (int i = 1; i < m; i++) {
            prev = prev.next;
        }

        // The m-th node becomes the tail of the reversed sublist
        ListNode start = prev.next;
        ListNode then = start.next;

        // Reverse the sublist from m to n
        for (int i = 0; i < n - m; i++) {
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }

        return dummy.next;
    }
}