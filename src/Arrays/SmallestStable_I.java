package Arrays;
//3903
class SmallestStable_I {
    public static int firstStableIndex(int[] nums, int k) {
        int[] max = new int[nums.length];
        int[] min = new int[nums.length];
        max[0] = nums[0];
        for(int i = 1 ; i< nums.length;i++){
            max[i] = Math.max(nums[i],max[i-1]);
        }
        min[nums.length-1] = nums[nums.length];
        for (int i = nums.length-2;i>=0;i--){
            min[i] = Math.min(min[i+1],nums[i]);
        }
        for(int i = 0;i< nums.length;i++){
            if(max[i]-min[i]<=k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5,0,1,4};
        System.out.println(firstStableIndex(arr,3));
    }
}