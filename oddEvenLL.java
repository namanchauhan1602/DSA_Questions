/**
 * Odd Even Linked List ⭐⭐⭐
 */
public class oddEvenLL {
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
    
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode temp = head;
        ListNode odd = new ListNode(99);
        ListNode even = new ListNode(100);
        ListNode tempOdd = odd, tempEven = even;
        while (temp != null) {
            if (temp.val % 2 == 1) {
                ListNode a = new ListNode(temp.val);
                tempOdd.next = a;
                tempOdd = a;
                temp = temp.next;
            }else{
                ListNode a = new ListNode(temp.val);
                tempEven.next = a;
                tempEven = a;
                temp = temp.next;
            }
        }
        tempOdd.next = even.next;
        return odd.next;
    }
}