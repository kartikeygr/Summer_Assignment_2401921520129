class Solution {
    int preIdx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> m = new HashMap<>();

        // store inorder indexes
        for(int i = 0; i < inorder.length; i++) {
            m.put(inorder[i], i);
        }
        return build(preorder, 0, inorder.length - 1, m);
    }
    public TreeNode build(int[] preorder,int start,int end,HashMap<Integer,Integer> m){

        // no subtree
        if(start>end){
            return null;
        }

        // preorder gives root
        int rootVal = preorder[preIdx++];
        TreeNode root = new TreeNode(rootVal);

        // find root position in inorder
        int index = m.get(rootVal);

        // build left subtree
        root.left = build(preorder,start,index-1,m);

        // build right subtree
        root.right = build(preorder,index+1,end,m);
        return root;
    }
}
