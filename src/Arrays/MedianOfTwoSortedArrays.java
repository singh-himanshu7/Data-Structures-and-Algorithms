package Arrays;

public class MedianOfTwoSortedArrays {
    static void main(String[] args) {
        int[] num1 = {1,2};
        int[] num2 = {3};
        System.out.println(findMedianSortedArrays(num1,num2));
    }
    public static double[] combinedArray(int[] nums1, int[] nums2){
        int i = 0; int j = 0; int k = 0;
        double[] merged = new double[nums1.length + nums2.length];
        while ( i< nums1.length && j< nums2.length){
            if(nums1[i]<=nums2[j]){
                merged[k]=nums1[i];
                k++;
                i++;
            }
            else {
                merged[k]=nums2[j];
                k++;
                j++;
            }
        }
        while (i< nums1.length){
            merged[k++] = nums1[i++];
        }
        while (j<nums2.length){
            merged[k++]=nums2[j++];
        }
        return merged ;
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        double[] arr = combinedArray(nums1,nums2);

        double median = 0.0;
        if(arr.length%2==0){
            median= (arr[arr.length/2] + arr[(arr.length/2) - 1]) / 2.0;
        }
        else {
            median=arr[arr.length/2];
        }

        return median;
    }
}
