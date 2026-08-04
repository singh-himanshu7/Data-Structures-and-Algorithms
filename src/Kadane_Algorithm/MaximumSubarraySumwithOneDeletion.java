package Kadane_Algorithm;
//1186
class MaximumSubarraySumwithOneDeletion {
    public static int maximumSum(int[] arr) {
        int noDel  = arr[0];
        int oneDel = Integer.MIN_VALUE;
        int result = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            int prev_noDel = noDel;
            int prev_oneDel = oneDel;
            noDel = Math.max(noDel+arr[i] , arr[i]);
            int v2;
            if(prev_oneDel==Integer.MIN_VALUE){
                v2 = arr[i];
            }
            else{
                v2 = prev_oneDel + arr[i];
            }
            oneDel = Math.max(prev_noDel , v2);
            result = Math.max(result , Math.max(oneDel,noDel));
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,0,3};
        System.out.println(maximumSum(arr));
    }
}