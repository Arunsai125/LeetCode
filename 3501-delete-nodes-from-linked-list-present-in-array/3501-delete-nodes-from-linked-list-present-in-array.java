class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        ListNode ans = new ListNode(-1);
        ListNode dummy = ans;        
        ListNode temp = head;
        while(temp!=null){
            if(set.contains(temp.val)){
                temp = temp.next;
                continue;
            }
            ListNode newNode = new ListNode(temp.val);
            dummy.next = newNode;
            dummy = dummy.next;
            temp = temp.next;
        }
    return ans.next;
    }
}