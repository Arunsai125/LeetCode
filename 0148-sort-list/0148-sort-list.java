class Solution {
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
    public ListNode mergeSort(ListNode root){
        if(root==null || root.next==null) return root;
        ListNode middle = findMiddle(root);
        ListNode leftHead = root;
        ListNode rightHead = middle.next;
        middle.next = null;
        ListNode leftPart = mergeSort(leftHead);
        ListNode rightPart = mergeSort(rightHead);
    return merge(leftPart, rightPart);
    }
    public ListNode findMiddle(ListNode root){
        if(root==null || root.next==null) return root;
        ListNode slow = root;
        ListNode fast = root;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
    return slow;
    }
    public ListNode merge(ListNode left, ListNode right){
        if(left==null && right==null) return null;
        if(left==null) return right;
        if(right==null) return left;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode p1 = left;
        ListNode p2 = right;
        while(p1!=null && p2!=null){
            if(p1.val < p2.val){
                temp.next = p1;
                temp=temp.next;
                p1=p1.next;
            }
            else{
                temp.next = p2;
                temp=temp.next;
                p2=p2.next;
            }
        }
        while(p1!=null){
            temp.next = p1;
            temp=temp.next;
            p1=p1.next;
        }
         while(p2!=null){
            temp.next = p2;
            temp=temp.next;
            p2=p2.next;
        }
    return dummy.next;
    }
}