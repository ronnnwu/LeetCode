package package1;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {

    public int lengthOfLongestSubstring(String s) {
        int res = s==null? 0 : 1;
        int head = 0;
        Map<Character, Integer> seenSoFar = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (seenSoFar.containsKey(c) && seenSoFar.get(c) >= head) {
                res = Math.max(res, i-head);
                head = i;
            }
            seenSoFar.put(c, i);
        }
        return res;
    }
}
