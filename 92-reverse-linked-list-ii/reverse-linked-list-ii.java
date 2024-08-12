public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null)
        { return null;
        }

        ListNode temp = new ListNode(0);
        temp.next = head;


        ListNode prev = temp;
        for (int i = 1; i < m; i++) {
            prev = prev.next;
        }

        ListNode fast = prev.next;
        ListNode slow= fast.next;

      
        for (int i = 0; i < n - m; i++) {
            fast.next = slow.next;
            slow.next = prev.next;
            prev.next = slow;
            slow = fast.next;
        }

        return temp.next;
    }
}