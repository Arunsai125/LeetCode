class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode ans=dummy;
        ListNode temp1=l1,temp2=l2;
        int carry=0;
        while(temp1!=null || temp2!=null){
            int sum=carry;
            if(temp1!=null) sum+=temp1.val;
            if(temp2!=null) sum+=temp2.val;
            ListNode curr = new ListNode(sum%10);
            ans.next=curr;
            ans=ans.next;
            carry=sum/10;
            if(temp1!=null) temp1=temp1.next;
            if(temp2!=null) temp2=temp2.next;
        }
        if(carry!=0){
            ListNode k = new ListNode(carry);
            ans.next=k;
        }
    return dummy.next;
    }
}