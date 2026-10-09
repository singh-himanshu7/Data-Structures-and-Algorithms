package Stack;
import java.util.Arrays;
import java.util.Stack;
//503
class NGE_II {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans,-1);
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        for(int i = 2*n -1;i>=0;i--){
            int num = nums[i%n];
            while(!stack.isEmpty() && stack.peek()<=num){
                stack.pop();
            }
            if(i<n && !stack.isEmpty()){
                ans[i] = stack.peek();
            }
            stack.push(nums[i]);
        }
        return ans;
    }
}