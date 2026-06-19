class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

        int n=nums.length;
        int[] ans=new int[n-k+1];

        Deque<Integer> d = new LinkedList<>();
        int idx=0;

        for(int i=0;i<n;i++) {
            // remove out of window indices
            if(!d.isEmpty() && d.peekFirst()<= i-k) {
                d.pollFirst();
            }

            // remove smaller elements
            while(!d.isEmpty() && nums[d.peekLast()]<nums[i]) {
                d.pollLast();
            }

            // add current index
            d.offerLast(i);

            // start storing answers after first window
            if(i >=k-1) {
                ans[idx++] =nums[d.peekFirst()];
            }
        }
        return ans;
    }
}
