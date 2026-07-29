package Arrays;
//581
class ShortestUNsortedSubArray {
    public static int findUnsortedSubarray(int[] nums) {
        int max = nums[0];
        int end = -1;
        int start = -1;

        for(int i= 0;i<nums.length;i++){
            max = Math.max(nums[i],max);
            if(nums[i]<max){
                end = i;
            }
        }
        int min = nums[nums.length-1];
        for(int i =nums.length-1-1;i>=0;i--){
            min = Math.min(min,nums[i]);
            if(nums[i]>min){
                start = i;
            }
        }
        if(start==-1){
            return 0;
        }
        return end-start+1;
    }
    public static void main(String[] args) {
        int [] nums = {2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarray(nums));
    }
}