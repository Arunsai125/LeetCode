public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(head==null || head.next==null) return null;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        if(slow!=fast) return null;
        ListNode st1 = head;
        ListNode st2 = slow;
        while(st1!=st2){
            st1=st1.next;
            st2=st2.next;
        }
    return st1;
    }
}