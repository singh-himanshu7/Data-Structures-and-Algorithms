package Arrays;
//643
/*
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75 */
class MaxAverageSubArray {
    public static double findMaxAverage(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int sum = 0;
        while (high<k){
            sum = sum+nums[high++];
        }
        int max = sum;
        while (high<nums.length){
            sum = sum + nums[high++]-nums[low++];
            max = Math.max(sum,max);
        }
        return (double) max/k;
    }
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));
    }
}