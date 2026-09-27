class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevNode=null;
        ListNode nextNode=null;
        while(temp!=null){
            ListNode kthNode = findKthNode(temp,k);
            if(kthNode==null){
                prevNode.next = nextNode;
                break;
            }
            nextNode = kthNode.next;
            kthNode.next=null;
            reverse(temp);
            if(head == temp){
                head = kthNode;
            }
            else{
                prevNode.next = kthNode;
            }
            prevNode = temp;
            temp = nextNode;
        }
    return head;
    }
    public ListNode findKthNode(ListNode temp, int k){
        while(k!=1 && temp!=null){
            k--;
            temp = temp.next;
        }
    return k>1 ? null : temp;
    }
    public ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
    return prev;
    } 
}