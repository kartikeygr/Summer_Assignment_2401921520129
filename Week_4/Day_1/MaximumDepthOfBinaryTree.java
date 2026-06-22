class Solution {
    public int maxDepth(TreeNode root) {
        //base case
        if(root==null){
            return 0;
        }
        //left subtree height
        int left=maxDepth(root.left);
        //right subtree height
        int right=maxDepth(root.right);
        //current height
        return 1 + Math.max(left,right);
    }
}
