package Arrays;

import java.util.Arrays;

import static java.util.Arrays.sort;

//977
public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] square=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int idx=nums.length-1;
        while(j>=i){
            int left=nums[i]*nums[i];
            int right=nums[j]*nums[j];
            if(right>left){
                square[idx]=right;
                j--;
            }else{
                square[idx]=left;
                i++;
            }
            idx--;
        }
        return square;
    }
}
