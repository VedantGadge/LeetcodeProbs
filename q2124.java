public class q2124 {
    public static boolean checkString(String s) {
        int res=0;
        int k=0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                k++;
            }
            else if(s.charAt(i)=='a' && k==0){
                continue;
            }
            else{
                res++;
            }

        }
        if(res!=0){
            return false;
        }
        else{return true;}

    }

    public static void main(String[] args) {
        String s = "babb";
        System.out.println(checkString(s));
    }
}
