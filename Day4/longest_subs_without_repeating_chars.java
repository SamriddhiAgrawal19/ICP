package Day4;

import java.util.HashSet;
import java.util.Set;

public class longest_subs_without_repeating_chars {
    class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l  = 0 ;
        int maxlen = 0 ;
        Set<Character> set = new HashSet<>();
        for(int r = 0 ; r < n ; r++){
            while(set.contains(s.charAt(r))){
                maxlen = Math.max(maxlen , r - l);
                set.remove(s.charAt(l));
                l++;


            }
            set.add(s.charAt(r));
            maxlen = Math.max(maxlen , r -l +1);
        }
        return maxlen;
    }
}
}
