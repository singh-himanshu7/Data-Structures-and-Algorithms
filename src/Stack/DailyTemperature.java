package Stack;
import java.util.Stack;
//739
class DailyTemperature {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=1;i< temperatures.length;i++){
            int currentTemp = temperatures[i];
            while (!stack.isEmpty()){
                int idx = stack.peek();
                int tempTop = temperatures[stack.peek()];
                if(temperatures[stack.peek()]<temperatures[i]){
                    ans[idx] = i-idx;
                    stack.pop();
                }
                else {
                    break;
                }
            }
            stack.push(i);
        }
        return ans;
    }
}