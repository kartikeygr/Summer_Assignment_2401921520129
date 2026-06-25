class Solution {
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }

        // ignore negative paths
        int left =Math.max(0,dfs(root.left));
        int right =Math.max(0,dfs(root.right));

        // path through current node
        int currPath = left+right+root.val;

        // update global maximum
        maxSum = Math.max(maxSum,currPath);

        // return one-side path
        return root.val + Math.max(left,right);
    }
}
