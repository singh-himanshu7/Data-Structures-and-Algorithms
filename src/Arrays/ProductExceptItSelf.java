package Arrays;
//238
import java.util.Arrays;

class ProductExceptItSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        int pre = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = pre;
            pre *= nums[i];
        }

        int suf = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suf;
            suf *= nums[i];
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] array = {-1,-1,0,-3,3};
        ProductExceptItSelf pes = new ProductExceptItSelf();
        System.out.println(Arrays.toString(pes.productExceptSelf(array)));
    }
}