class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0,head);
        ListNode prev=dummy;
        for(int i=0;i<left-1;i++){
            prev=prev.next;
        }
        ListNode curr=prev.next;
        for(int i=0;i<right-left;i++){
            ListNode ahead=curr.next;
			curr.next=ahead.next;
            ahead.next=prev.next;
            prev.next=ahead;
        }
        return dummy.next;
    }
}
