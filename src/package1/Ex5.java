package package1;

public class Ex5 {
    public String longestPalindrome(String s) {

        String res = "";

        for (int i=0; i<s.length(); i++) {

            for (int j=1; j<s.length()-i; j++) {
                if (i-j<0) break;
                if (s.charAt(i-j) == s.charAt(i+j)) {
                    if (2*j> res.length())
                        res = s.substring(i-j, i+j+1);
                } else {
                    break;
                }
            }

            for (int j=0; j<s.length()-i-1; j++) {
                if (i-j<0) break;
                if (s.charAt(i-j) == s.charAt(i+j+1)) {
                    if (2*j+1> res.length())
                        res = s.substring(i-j, i+j+2);
                } else {
                    break;
                }
            }

        }
        return res;
    }
}
