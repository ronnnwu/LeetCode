package package1;


import java.util.List;

public class Ex13 {

    public int romanToInt(String s) {

        StringBuilder sb = new StringBuilder(s);

        List<Ex12.Pair<Integer, String>> map = Ex12.map;

        int result = 0;

        for (Ex12.Pair<Integer, String> p: map) {
            while (sb.length() > 0){
                if (sb.length() >=2 && sb.substring(0,2).equals(p.y)) {
                    result += p.x;
                    sb = sb.delete(0,2);
                }
                else if (sb.substring(0,1).equals(p.y)) {
                    result += p.x;
                    sb = sb.delete(0,1);
                } else {
                    break;
                }
            }
        }

        return result;
    }

}
