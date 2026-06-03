class Solution {
    public int maxArea(int[] height) {
        int maxWater=0;
        // left and right we take pointer means index so width will be right index - left index so we get the gap between them.
        int left=0;
        int right=height.length-1;
        while(left<right){
            int w=right-left;
            int ht=Math.min(height[left], height[right]);
            int currWater=w*ht;
            maxWater=Math.max(maxWater, currWater);

            if(height[left]<height[right]){
                // in this we check if height of left index is less so we move to forward side because we are finding the bigger container which contains maxwater 
                left++;
            } else{
                right--;
            }
        }
        return maxWater;
    }
}
