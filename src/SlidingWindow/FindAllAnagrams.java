package SlidingWindow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//438
class FindAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        HashMap<Character,Integer> pmap = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        int j = 0;
        for(int i = 0; i<p.length();i++){
            char ch = p.charAt(i);
            pmap.put(ch,pmap.getOrDefault(ch,0)+1);
        }
        for(int i = 0; i< s.length();i++){
            char ch = s.charAt(i);
            window.put(ch,window.getOrDefault(ch,0)+1);

            if(i-j+1==p.length()){
                if(pmap.equals(window)){
                    list.add(j);
                }
                char left = s.charAt(j);
                window.put(left,window.get(left)-1); 
                if(window.get(left)==0){
                    window.remove(left);
                }
                j++;
            }
        }
        return list;
    }
}