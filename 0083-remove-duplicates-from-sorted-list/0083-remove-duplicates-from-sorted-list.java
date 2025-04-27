class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode ans = head;
        ListNode temp = head;
        ListNode prev = temp;
        temp = temp.next;
        while(temp!=null){
            if(temp.val==prev.val){
                temp=temp.next;
                prev.next=temp;
            }
            else{
                prev=prev.next;
                temp=temp.next;
            }
        }
    return ans;
    }
}