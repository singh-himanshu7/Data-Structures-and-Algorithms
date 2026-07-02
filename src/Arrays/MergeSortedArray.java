package Arrays;
//88
import java.util.Arrays;

class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for(int i = m ; i< nums1.length;i++){
            nums1[i] = nums2[j++];
        }
//        System.out.println(Arrays.toString(nums1));
        Arrays.sort(nums1);
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}; //m = 3
        int[] nums2 = {2,5,6}; // n=3
        merge(nums1,3,nums2,3);
    }
}