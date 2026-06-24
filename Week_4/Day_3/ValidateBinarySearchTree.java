class Solution {
    public boolean isValidBST(TreeNode root) {
        return checkBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean checkBST(TreeNode root,long min,long max) {
        // empty tree is valid
        if(root==null){
            return true;
        }
        // BST condition fails
        if(root.val<=min || root.val>=max) {
            return false;
        }

        // check left and right subtree
        return checkBST(root.left,min,root.val) && checkBST(root.right,root.val,max);
    }
}
