class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        int carry=0;
        ListNode dummy = new ListNode(-1);
        ListNode ptr = dummy;
        while(p1!=null || p2!=null){
            int newVal=0;
            if(p1==null) newVal = p2.val+carry;
            else if(p2==null) newVal = p1.val+carry;
            else newVal = p1.val + p2.val + carry;
            if(newVal >= 10){
                carry=1;
                newVal=newVal%10;
            }
            else carry=0;
            ListNode temp = new ListNode(newVal);
            ptr.next = temp;
            ptr = ptr.next;
            if(p1!=null) p1 = p1.next;
            if(p2!=null) p2 = p2.next;
        }   
        if(carry==1) ptr.next = new ListNode(1);
    return dummy.next;
    }
}