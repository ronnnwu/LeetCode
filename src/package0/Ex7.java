package package0;

public class Ex7 {

    public int reverse(int x) {
        String s = String.valueOf(x);
        boolean negative = x<0;
        if (negative) s = s.substring(1);
        StringBuilder sb = new StringBuilder(s);
        int integer = 0;
        try{
            integer = Integer.valueOf((sb.reverse()).toString());
        } catch (Exception ex) {

        }
        if (negative) integer = -integer;
        return integer;
    }

}
