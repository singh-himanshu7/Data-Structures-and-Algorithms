package SlidingWindow;
//713
class SubarrayProductLessthanK {
    public int numSubarrayProductLessThanK(int[] nums, int k){
        int j = 0;
        int count = 0;
        int prod  = 1;
        if(k<=1){
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            prod *= nums[i];
            while(prod>=k){
                prod = prod/nums[j];
                j++;
            }
            count+=i-j+1;
        }
        return count;
    }
}