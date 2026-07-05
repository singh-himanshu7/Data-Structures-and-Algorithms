package Strings;
//242
import java.util.Arrays;

class Anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int n = s.length();
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        for(int i = 0; i < n ; i++){
            if(ss[i]!=tt[i]){
             return false;
            }
        }
        return true;
    }
}