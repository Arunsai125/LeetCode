class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        int ans = 0;
        while(slow!=null){
            ans = Math.max(ans, (prev.val+slow.val));
            slow = slow.next;
            prev = prev.next;
        }
    return ans;
    }
}