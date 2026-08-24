package Stack;
//1047
import java.util.Stack;

class RemoveAllAdjacentDuplicate {
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i = 1; i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }
            else if( s.charAt(i)==stack.peek()){
                stack.pop();
            }
            else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
}