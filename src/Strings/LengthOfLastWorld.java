package Strings;
//58
public class LengthOfLastWorld {
    public static void main(String[] args) {
        String str = "Hello  World";
        System.out.println(lengthOfLastWord(str));
    }
    public static int lengthOfLastWord(String s) {
        int i = s.length()-1;
        int count = 0;
        while (i>=0 && s.charAt(i)==' '){
            i--;
        }
        while (i>=0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;
    }
}
