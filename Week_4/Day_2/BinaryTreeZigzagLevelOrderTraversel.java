class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        boolean leftToRight=true;
        while(!que.isEmpty()) {

            int s=que.size();

            List<Integer> level = new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode current=que.poll();

                // normal order
                if(leftToRight) {
                    level.add(current.val);
                } else {
                    // reverse order
                    level.add(0, current.val);
                }
                if(current.left !=null) {
                    que.offer(current.left);
                }
                if(current.right !=null) {
                    que.offer(current.right);
                }
            }
            ans.add(level);
            // change direction
            leftToRight = !leftToRight;
        }

        return ans;
    }
}
