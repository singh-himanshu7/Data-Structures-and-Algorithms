package Kadane_Algorithm;
//1749
class MaxAbsSumOfAnySubArray {
    public int maxAbsoluteSum(int[] nums) {
        int bestend = nums[0];
        int Maximum = nums[0];
        int Minimum = nums[0];
        for(int i = 1 ; i< nums.length;i++){
            int v1 = bestend + nums[i];
            int v2 = nums[i];
            bestend = Math.max(v1,v2);
            Maximum = Math.max(Maximum,bestend);
        }
        bestend = nums[0];
        for(int i = 1 ; i< nums.length;i++){
            int v1 = bestend + nums[i];
            int v2 = nums[i];
            bestend = Math.min(v1,v2);
            Minimum = Math.min(Minimum,bestend);
        }
        return Math.max(Maximum,-Minimum);
    }
}