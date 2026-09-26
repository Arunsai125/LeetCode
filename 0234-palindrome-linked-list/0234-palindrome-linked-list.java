class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode revHead = reverse(slow.next);
        ListNode st1 = head;
        ListNode st2 = revHead;
        while(st2!=null){
            if(st1.val != st2.val){
                slow.next = reverse(revHead);
                return false;
            }
            st1=st1.next;
            st2=st2.next;
        }
        slow.next = reverse(revHead);
    return true;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode temp = head;
        while(temp!=null){
            ListNode next = temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
    return prev;
    }
}