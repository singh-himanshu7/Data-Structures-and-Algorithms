package Arrays;

import java.util.Arrays;

import static java.util.Arrays.sort;

//977
public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] sqarr = new int[nums.length];
        for(int i = 0; i<nums.length;i++){
            sqarr[i] = nums[i] * nums[i];
        }
        Arrays.sort(sqarr);
        return sqarr;
    }
}
