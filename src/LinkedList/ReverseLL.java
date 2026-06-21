package LinkedList;
//206
class ReverseLL {
    public ListNode reverseList(ListNode head) {
        ListNode present = head;
        ListNode prev = null;
        ListNode next = present.next;
        while(present!=null){
            present.next = prev;
            prev = present;
            present = next;

            if(next!=null){
                next = next.next;
            }
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode list = new ListNode(34);
        System.out.println(list);
    }
}