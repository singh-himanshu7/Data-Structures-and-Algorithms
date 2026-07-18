package Arrays;
//55
class JumpGame {
    public static boolean canJump(int[] nums) {
        int i = 1;
//        int ptr = 0;
        int range = nums[0];
        while(i< nums.length){
            if(range < i){
                return false;
            }
            if(range < i+nums[i]){
                range = i+nums[i];
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        int [] nums = {2,3,1,1,4};
        canJump(nums);
    }
}