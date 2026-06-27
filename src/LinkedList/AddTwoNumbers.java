package LinkedList;

//2
class AddTwoNumbers extends ListNode {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int a = 0;
            int b = 0;
            if (l1 != null) {
                a = l1.val;
            }
            if (l2 != null) {
                b = l2.val;
            }
            int sum = a + b + carry;
            carry = sum / 10;
            ans.next = new ListNode(sum % 10);
            ans = ans.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) {
            ans.next = new ListNode(carry);
        }
        return dummy.next;
    }
}