public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder str = new StringBuilder();
        preorder(root, str);
        return str.toString();
    }

    public void preorder(TreeNode root,StringBuilder str){
        // null node
        if(root==null){
            str.append("null,");
            return;
        }
        // current node
        str.append(root.val).append(",");
        // left subtree
        preorder(root.left, str);
        // right subtree
        preorder(root.right, str);
    }
    // deserialize string into tree
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        Queue<String> que = new LinkedList<>();

        for(String s : arr) {
            que.offer(s);
        }
        return buildTree(que);
    }
    public TreeNode buildTree(Queue<String> que) {
        String val = que.poll();

        // null node
        if(val.equals("null")) {
            return null;
        }
        // create node
        TreeNode root =new TreeNode(Integer.parseInt(val));
        // build left subtree
        root.left =buildTree(que);
        // build right subtree
        root.right = buildTree(que);
        return root;
    }
}
