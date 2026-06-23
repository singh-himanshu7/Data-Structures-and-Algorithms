package Arrays;

import java.util.Arrays;

class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0]+nums[1]+nums[2];
        for(int i = 0 ; i < nums.length ; i++){
            int l = i+1;
            int r = nums.length-1;
            while (l < r){
                int current = nums[i]+nums[l]+nums[r];

                if(Math.abs(current-target) < Math.abs(closest-target)){
                    closest = current;
                }
                if(current<target){
                    l++;
                } else if (current>target) {
                    r--;
                }
                else return target;
            }
        }
        return closest;
    }
}