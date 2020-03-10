package package0;

public class Ex8 {

    public int myAtoi(String str) {
        str = str.strip();
        if (str.equals("")) return 0;

        boolean negative = false;
        if (str.charAt(0) == '-') {
            str =  str.substring(1);
            negative = true;
        } else if (str.charAt(0) == '+') {
            str =  str.substring(1);
        }

        if (str.equals("")) return 0;

        try {
            Integer.parseInt(Character.toString(str.charAt(0)));
        } catch (Exception ex) {
            return 0;
        }



        StringBuilder sb = new StringBuilder();
        for (int i=0; i< str.length(); i++) {
            char c = str.charAt(i);

            try {
                Integer.parseInt(Character.toString(c));
                sb.append(c);
            } catch (Exception ex){
                break;
            }
        }

        if (sb.length() == 0) return 0;

        try {
            Integer integer = Integer.valueOf(sb.toString());
            return negative? -integer : integer;
        } catch (Exception ex){
            return negative?Integer.MIN_VALUE: Integer.MAX_VALUE;
        }
    }
}
