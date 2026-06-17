package Strings;

public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        char[] letter = {'b','d','f'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letter,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target<letters[mid]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return letters[start % letters.length];}
}
