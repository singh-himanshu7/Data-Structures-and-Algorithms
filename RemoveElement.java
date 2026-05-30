import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args){
        int[] arr = {1,2,4,3,2,2};
        System.out.println(removeElement(arr,2));
    }
        public static int removeElement(int[] nums, int val) {
        int i = 0;
        int len = nums.length-1;
        while(i <= len){
            if(nums[i]==val){
                int temp = nums[i];
                nums[i] = nums[len];
                nums[len] = temp;
                len--;
            }
            else{
                i++;
            }
        }
//        System.out.println(Arrays.toString(nums));
        return len+1;
    }
}