package Arrays;
//152
class MaxProductSubarray {
    public int maxProduct(int[] nums) {
        int maxi = nums[0];
        int mini = nums[0];
        int res = nums[0];
        for(int i = 1 ; i < nums.length ;i++){
            int v1 = maxi * nums[i];
            int v2 = mini * nums[i];
            int v3 = nums[i];
            maxi = Math.max(v3,Math.max(v1,v2));
            mini = Math.min(v3,Math.min(v1,v2));

            res = Math.max(res,Math.max(mini,maxi));
        }
        return res;
    }
}