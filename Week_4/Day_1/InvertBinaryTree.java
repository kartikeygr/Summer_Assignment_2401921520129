class Solution {

    public TreeNode invertTree(TreeNode root) {
        // base case
        if(root==null) {
            return null;
        }
        // swap children
        TreeNode temp =root.left;
        root.left =root.right;
        root.right =temp;
        // invert left subtree
        invertTree(root.left);
        // invert right subtree
        invertTree(root.right);

        return root;
    }
}
