class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        // First window sum
        for(int i=0;i<k;i++) {
            sum += nums[i];
        }
        int maximumSum=sum;
        // Sliding window
        for(int i=k;i<nums.length;i++) {
            sum = sum - nums[i-k] + nums[i];
            maxSum = Math.max(maximumSum, sum);
        }
        return (double) maximumSum / k;
    }
}
