package Arrays;
//3731
import java.lang.reflect.Array;
import java.util.*;

class FindMissingElements {
    public static List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i <= nums.length-1;i++){
            set.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>();
        int st = nums[0];
        int end = nums[nums.length-1];
        for(int i = st;i<=end;i++){
            if(set.contains(i)){
                //kuch mat karo
            }
            else {
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {3,5,7};
        System.out.println(findMissingElements(nums));
    }
}