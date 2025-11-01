class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        ListNode ans = new ListNode(-1);
        ListNode prev = ans;
        ListNode dummy = ans;        
        ListNode temp = head;
        while(temp!=null){
            if(set.contains(temp.val)){
                if(dummy.next==null){
                    temp=temp.next;
                    continue;
                }
                else{
                    ListNode next = temp.next;
                    prev.next = null;
                    temp.next = null;
                    temp = next;
                    continue;
                }
            }
            dummy.next = temp;
            dummy = dummy.next;
            prev = temp;
            temp = temp.next;

        }
    return ans.next;
    }
}