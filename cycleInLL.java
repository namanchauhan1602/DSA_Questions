import java.util.ArrayList;
import java.util.List;

/**
 * cycleInLL
 */
public class cycleInLL {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    static ListNode hasCycle(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while (!list.contains(head)) {
            if(head == null) return null;
            list.add(head);
            head = head.next;
        }
        return head;
    }
}