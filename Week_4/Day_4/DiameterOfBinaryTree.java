class Solution {
    //diameter
    int d=0;
    public int diameterOfBinaryTree(TreeNode root) {
         height(root);
        return d;
    }

    public int height(TreeNode root){
        // base case
        if(root==null){
            return 0;
        }
        // left subtree height
        int left = height(root.left);
        // right subtree height
        int right = height(root.right);

        // update diameter
        d=Math.max(d,left+right);
        // return current height
        return 1 + Math.max(left,right);
    }
}
