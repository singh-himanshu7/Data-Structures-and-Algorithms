package Searching.problemsOnBinarySearch;
//540
class SingleElementInASortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,5,5};
        System.out.println(singleNonDuplicate(arr));
    }
    public static int singleNonDuplicate(int[] nums) {
        int st = 0;
        int end = nums.length-1;
        while (st<end){
            int mid = st + ((end-st)/2);
            if(mid%2 ==0){
                if(nums[mid]==nums[mid+1]){
                    st = mid+2;
                }
                else {
                    end = mid;
                }
            }
            else {
                if(nums[mid]==nums[mid-1]){
                    st = mid +1;
                }
                else {
                    end = mid;
                }
            }
        }
        return nums[st];
    }
}