/**
 * Remove Duplicates from Sorted List ⭐⭐
 */
public class removeDupliateFromLL {
    public class ListNode {
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

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode temp1 = head, temp2 = head;
        while (temp2 != null) {
            if (temp2.next != null) {
                if (temp2.next.val == temp1.val) {
                    temp2 = temp2.next;
                } else {
                    temp1.next = temp2.next;
                    temp2 = temp2.next;
                    temp1 = temp2;
                }
            } else {
                temp1.next = null;
                temp2 = temp2.next;
            }
        }
        return head;
    }
}