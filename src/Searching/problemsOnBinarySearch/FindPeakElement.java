package Searching.problemsOnBinarySearch;

public class FindPeakElement {
    static void main(String[] args) {
        int[] arr = {1,5,6,7,1};
        System.out.println(findPeakElement(arr));
    }
    public static int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while(low < high){
            int mid = low + ((high-low)/2);
            if(nums[mid]<nums[mid+1]){
                low = mid+1;
            }
            if (nums[mid]>nums[mid+1]){
                high = mid;
            }
        }
        return low;
    }
}
