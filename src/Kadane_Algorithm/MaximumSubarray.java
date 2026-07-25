package Kadane_Algorithm;
//53
class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int bestEnd = nums[0];
        int answer = nums[0];
        for(int i = 1;i < nums.length;i++){
            int v1 = bestEnd + nums[i];
            int v2 = nums[i];
            bestEnd = Math.max(v1,v2);
            answer = Math.max(answer,bestEnd);
        }
        return answer;
    }
}