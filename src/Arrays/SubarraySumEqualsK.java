package Arrays;

import java.util.HashMap;

//560
class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap();
        int sum = 0;
        int res = 0;
        map.put(0,1) ;
        for(int i = 0; i< nums.length ; i++){
            sum = sum+ nums[i];
//            int ques = sum-k;
            int freq = map.getOrDefault(sum-k,0);
            res += freq;
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subarraySum(nums,3));
    }
}