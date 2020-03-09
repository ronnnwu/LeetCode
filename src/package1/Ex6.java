package package1;

import java.util.HashMap;
import java.util.Map;

public class Ex6 {

    public String convert(String s, int numRows) {
        Map<Integer, StringBuilder> map = new HashMap<>();
        for (int i=0; i<numRows; i++){
            map.put(i, new StringBuilder());
        }

        boolean godown = true;
        int start = 0;
        for (int i=0; i<s.length(); i++) {
            map.put(start, map.get(start).append(s.charAt(i)));
            if (godown) {
                start ++;
            } else {
                start --;
            }
            if (start == 0) godown = true;
            else if (start == numRows - 1) godown = false;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<numRows; i++){
            sb.append(map.get(i));
        }
        return sb.toString();
    }
}
