class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        inorder(root,output);
        return output;
    }

    public void inorder(TreeNode root, List<Integer> output) {
        // base case
        if(root==null) {
            return;
        }
        // left
        inorder(root.left,output);
        // root
        output.add(root.val);
        // right
        inorder(root.right,output);
    }
}
