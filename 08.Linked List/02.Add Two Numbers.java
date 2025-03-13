Input:
l1 = [2 → 4 → 3] (342)
l2 = [5 → 6 → 4] (465)

l1	l2	Carry	Sum	New Node	Carry Forward
2	5	0	     2+5=7	7	0
4	6	0	    4+6=10	0	1
3	4	1	   3+4+1=8	8	0
Result: [7 → 0 → 8] (807) ✅



class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy =new ListNode();
        ListNode cur=dummy;
        int carry=0;

        while(l1!=null || l2!=null || carry!=0){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            cur.next=new ListNode(sum%10);
            cur=cur.next;
        }
        return dummy.next;
        
            }
}
