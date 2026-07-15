package Arrays;
//209
class MinSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int minimun = Integer.MAX_VALUE;
        int sum = 0;
        int low = 0;
        int high = 0;
        while (high< nums.length){
            sum = sum + nums[high];
            while (sum>=target){
                int len = high-low+1;
                minimun = Math.min(minimun,len);
                sum = sum-nums[low];
                low++;
            }
            high++;
        }
        if(minimun==Integer.MAX_VALUE){
            return 0;
        }
        else return minimun;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int target = 7;
        System.out.println(minSubArrayLen(target,nums));
    }
}