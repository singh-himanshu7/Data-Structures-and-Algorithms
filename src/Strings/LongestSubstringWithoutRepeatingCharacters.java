package Strings;
import java.util.HashSet;
//3
class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int low = 0;
        int maxi = 0;
        HashSet<Character> set = new HashSet<>();
        for(int high = 0 ;high < s.length();high++){
            while(set.contains(s.charAt(high))){
                set.remove(s.charAt(low++));
            }
            set.add(s.charAt(high));
            maxi = Math.max(maxi,high-low+1);
        }
        return maxi;
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}