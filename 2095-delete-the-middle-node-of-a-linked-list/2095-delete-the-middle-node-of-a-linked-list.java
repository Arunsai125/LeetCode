class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow = slow.next;
            fast=fast.next.next;
        }
        prev.next=prev.next.next;
    return head;
    }
}