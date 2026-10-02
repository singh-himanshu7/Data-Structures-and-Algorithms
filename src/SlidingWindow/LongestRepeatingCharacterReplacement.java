package SlidingWindow;

import java.util.HashMap;
//424
class  LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int j = 0;
        int len = 0;
        int freq = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            freq = Math.max(freq,map.get(ch));
            while((i-j+1)-freq > k){
                char left = s.charAt(j);
                map.put(left,map.get(left)-1);
                j++;
            }
            len = Math.max(len,i-j+1);
        }
        return len;
    }
}