package package1;

import java.util.List;

public class Ex12 {

    static class Pair<X, Y> {

        X x;
        Y y;

        Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }

    static List<Pair<Integer, String>> map = List.of(
        new Pair(1000, "M"),
        new Pair(900, "CM"),
        new Pair(500, "D"),
        new Pair(400, "CD"),
        new Pair(100, "C"),
        new Pair(90, "XC"),
        new Pair(50, "L"),
        new Pair(40, "XL"),
        new Pair(10, "X"),
        new Pair(9, "IX"),
        new Pair(5, "V"),
        new Pair(4, "IV"),
        new Pair(1, "I"));

    public String intToRoman(int num) {

        StringBuilder sb = new StringBuilder();

        for (Pair<Integer, String> p: map){
            while(num>=p.x) {
                num -= p.x;
                sb.append(p.y);
            }
        }
        return sb.toString();
    }

}
