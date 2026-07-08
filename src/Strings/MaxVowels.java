package Strings;
//1456
class MaxVowels {
    public static int maxVowels(String s, int k) {
        char[] str = s.toCharArray();
        int low = 0;
        int high = 0;
        int count = 0;
        while (high<k){
            if(str[high]=='a' || str[high]=='e' || str[high]== 'i' || str[high]=='o' || str[high]=='u'){
               count++;
            }
            high++;
        }
        int max = count;
        while (high< str.length) {
            if (isVowel(str[high++])){
                count++;
            }
            if (isVowel(str[low++])){
                count--;
            }
            max = Math.max(max,count);
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 3;
        System.out.println(maxVowels(s,k));
    }
    private static boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}