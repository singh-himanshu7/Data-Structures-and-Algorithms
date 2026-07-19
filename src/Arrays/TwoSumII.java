package Arrays;
//167
class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length-1;
        int [] ans = {0,0};
        while(low<high){
            int sum = numbers[low]+numbers[high];
            if(sum>target){
                high--;
            }
            if(sum<target){
                low++;
            }
            if (sum==target){
                ans[0] = low+1;
                ans[1] = high+1;
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,4};
        System.out.println(twoSum(nums,5));
    }
}