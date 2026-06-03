package Arrays;

public class SearchInsertPostion {
    static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7};
        System.out.println(searchInsert(arr, 2));
    }
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}

