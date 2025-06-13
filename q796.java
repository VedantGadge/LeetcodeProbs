public class q796 {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "abced"; 
        System.out.println(rotateString(s,goal));
    }

    static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String c = s + s;
        return c.contains(goal);
    }

        //generating and checking all rotations
        // boolean a = false;
        // for(int i = 0;i<s.length();i++){
        //     String rev1 = new StringBuilder(s.substring(0,i+1)).reverse().toString();
        //     String rev2 = new StringBuilder(s.substring(i+1)).reverse().toString();
        //     String rotated = new StringBuilder(rev1+rev2).reverse().toString();
        //     System.out.println(rotated);
        //     if(rotated.equals(goal)) a = true;
        // }
        // System.out.println(a);
    }
