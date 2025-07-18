class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow;
        Stack<ListNode> st = new Stack<>();
        while(temp!=null) { st.add(temp); temp = temp.next; }
        temp=head;
        while(!st.isEmpty()){
            ListNode top = st.pop();
            ListNode next = temp.next;
            if(top==temp || top == temp.next){
                top.next=null;
                break;
            }
            temp.next=top;
            top.next=next;
            temp=next;
        }
    }
}