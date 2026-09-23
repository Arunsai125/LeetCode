class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
    return isTargetSumPossible(list, k);
    }
    public void inorderTraversal(TreeNode root, List<Integer> list){
        if(root==null) return;
        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }
    public boolean isTargetSumPossible(List<Integer> list, int target){
        int start = 0;
        int end = list.size()-1;
        while(start<end){
            int value = list.get(start) + list.get(end);
            if(value == target) return true;
            else if(value > target) end--;
            else start++;
        }
    return false;
    }
}