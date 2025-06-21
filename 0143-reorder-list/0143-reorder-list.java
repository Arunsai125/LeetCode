class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Stack<ListNode> st = new Stack<>();
        ListNode temp=slow;
        while(temp!=null){
            st.add(temp);
            temp = temp.next;
        }
        ListNode curr = head;
        while(!st.isEmpty()){
           ListNode top = st.pop();
           ListNode next = curr.next;
           if(top==curr || top==curr.next){
                top.next=null;
                break;
           }
           curr.next = top;
           top.next=next;
           curr=next;
        }
    }
}