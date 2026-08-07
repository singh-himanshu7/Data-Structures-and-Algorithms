package LinkedList;
//234
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class PalindromeLL {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next == null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode firsthalf = head;
        ListNode secondhalf = rev(slow);

        while(secondhalf!=null){
            if(firsthalf.val==secondhalf.val){
                firsthalf = firsthalf.next;
                secondhalf = secondhalf.next;
            }
            else return false;
        }
        return true;
    }
    private static ListNode rev(ListNode head){
        ListNode p = null;
        ListNode q = head;
        while(q!=null){
            ListNode nextwala = q.next;
            q.next = p;
            p = q;
            q = nextwala;
        }
        return p;
    }
}