package Arrays;
//2574
import java.util.Arrays;

public class LeftAndRightSumDifferences {
    public static void main(String[] args){
        int[] arr = {10,4,8,3};
        System.out.println(Arrays.toString(leftDifference(arr)));
        //[15,1,11,22]
    }
    public static int[] leftDifference(int[] nums){
        int[] ls = new int[nums.length];
        int[] rs = new int[nums.length];
        //leftsum
        for(int i = 1 ; i < nums.length ; i++){
            ls[i] = ls[i-1]+nums[i-1];
        }
        //rightsum
        for(int i = nums.length-2; i >= 0 ; i--){
            rs[i] = rs[i+1] + nums[i+1];
        }
        int[] answer = new int[nums.length];
        for(int i = 0 ; i< nums.length ; i++){
            answer[i] = Math.abs(ls[i]-rs[i]);
        }
        return answer;
    }
}

