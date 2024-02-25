/**
 * Reverse Linked List ⭐⭐⭐
 */
public class revrseLL {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void diaplay(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static ListNode reverseLL(ListNode head){
        // Base case
        if(head.next == null) return head;
        ListNode newHead = reverseLL(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(5);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        diaplay(a);
        ListNode newHead = reverseLL(a);
        System.out.println();
        diaplay(newHead);
    }
}