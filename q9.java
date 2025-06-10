public class q9 {
    public static void main(String[] args) {
        int x = 1221;
        int temp = x;
        int rev = 0;
        if(x<0) //return false;
        while(x!=0){
            int digit = x % 10;
            rev = rev*10 + digit;
            x /= 10;
        }
         System.out.println(rev == temp);
    }
}
