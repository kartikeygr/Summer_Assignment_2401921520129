class Solution {
    public boolean isSymmetric(TreeNode root) {
        return mirror(root.left,root.right);
    }
    public boolean mirror(TreeNode left, TreeNode right) {

        // both null
        if(left==null && right==null){
            return true;
        }
        // one null
        if(left==null || right==null){
            return false;
        }
        // values must match
        if(left.val != right.val){
            return false;
        }
        // check mirror structure
        return mirror(left.left, right.right) && mirror(left.right, right.left);
    }
}
