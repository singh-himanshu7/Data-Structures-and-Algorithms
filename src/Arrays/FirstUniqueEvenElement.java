package Arrays;
import java.util.Arrays;

public class FirstUniqueEvenElement {
    static void main(String[] args) {
        int[] arr = {3,4,2,5,4,6};

    }
    public static int firstUniqueEven(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) continue;
            boolean isUnique = true;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return nums[i];
            }
        }
        return -1;
    }
}
