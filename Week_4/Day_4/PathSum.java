class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // empty tree
        if(root==null) {
            return false;
        }
        // leaf node
        if(root.left==null && root.right==null) {
            return targetSum==root.val;
        }
        // remaining target
        int remain = targetSum-root.val;

        // check left or right subtree
        return hasPathSum(root.left,remain) || hasPathSum(root.right,remain);
    }
}
