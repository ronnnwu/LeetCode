package package1;

public class Ex14 {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int idx = -1;
        boolean good = true;
        while (good){
            idx ++;
            if (idx>=strs[0].length()) {
                break;
            }
            char c = strs[0].charAt(idx);
            for (int i =1; i<strs.length; i++) {
                if (idx>=strs[i].length() || strs[i].charAt(idx) != c){
                    good = false;
                    break;
                }
            }
        }

        return strs[0].substring(0,idx);
    }
}
