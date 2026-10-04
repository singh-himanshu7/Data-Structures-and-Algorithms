package Strings;
//76
import java.util.HashMap;

class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        HashMap<Character,Integer> tmap = new HashMap<>();
        for(int i = 0; i< t.length();i++){
            char ch = t.charAt(i);
            tmap.put(ch,tmap.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> window = new HashMap<>();
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        int have = 0;
        int need = tmap.size();
        int left = 0;
        for(int right = 0; right < s.length() ; right++){
            char ch = s.charAt(right);
            window.put(ch,window.getOrDefault(ch,0)+1);
            if(tmap.containsKey(ch) && window.get(ch).equals(tmap.get(ch))){
                have++;
            }
            while(have==need){
                int currentLen = right-left+1;
                if(currentLen < minLen){
                    minLen = currentLen;
                    start = left;
                }
                char lchar = s.charAt(left);
                window.put(lchar,window.get(lchar)-1);
                if(tmap.containsKey(lchar) &&
                        (window.get(lchar)< tmap.get(lchar))){
                    have--;
                }
                left++;
            }
        }
        if(minLen==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+minLen);
    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        minWindow(s,t);
    }
}