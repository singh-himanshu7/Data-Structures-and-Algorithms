package Strings;
import java.util.ArrayList;
//844
class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        int skip = 0;
        for(int i= s.length()-1;i>=0;i--){
            if (s.charAt(i) == '#') {
                skip++;
            } else if (skip > 0) {
                skip--;
            } else {
                list.add(s.charAt(i));
            }
        }
        skip=0;
        for(int i= t.length()-1;i>=0;i--){
            if(t.charAt(i)=='#'){
                skip++;
            } else if (skip>0) {
                skip--;
            } else {
                list2.add(t.charAt(i));
            }
        }
        return (list.equals(list2));
    }
}