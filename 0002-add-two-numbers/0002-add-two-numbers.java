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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(-1);
        ListNode ptr=temp;
        int carry=0;
        ListNode t1 = l1;
        ListNode t2 = l2;
        while(t1!=null || t2!=null){
            int newVal = 0;
            if(t1==null) newVal = t2.val + carry;
            else if(t2==null) newVal = t1.val + carry;
            else newVal = t1.val + t2.val + carry;
            if(newVal > 9){
                carry = 1;
                newVal = newVal%10;
            }
            else carry=0;
            if(t1!=null)t1=t1.next;
            if(t2!=null)t2=t2.next;
            ListNode curr = new ListNode(newVal);
            ptr.next = curr;
            ptr = ptr.next;
        }
        if(carry==1) {
             ListNode curr = new ListNode(1);
             ptr.next = curr;
             ptr = ptr.next;
        }
    return temp.next;
    }
}