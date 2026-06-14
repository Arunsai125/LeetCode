/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        size=size/2;
        int ans = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int count=0;
        temp=head;
        while(temp!=null){
            count++;
            if(count<=size){
                stack.offerFirst(temp.val);
            }
            else{
                int twinOne = stack.pollFirst();
                ans = Math.max(ans, twinOne + temp.val);
            }
            temp=temp.next;
        }
    return ans;
    }
}