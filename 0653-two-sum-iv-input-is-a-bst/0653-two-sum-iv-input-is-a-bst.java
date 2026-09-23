class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
    return isTargetSumPossible(root, k, set);
    }
    public boolean isTargetSumPossible(TreeNode root, int target, Set<Integer> set){
        if(root==null) return false;
        if(set.contains(target-root.val)) return true;
        set.add(root.val);
        return isTargetSumPossible(root.left, target, set) || isTargetSumPossible(root.right, target, set);
    }
}