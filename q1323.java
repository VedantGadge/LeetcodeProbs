public class q1323 {
    public int maximum69Number (int num) {
        int ans = 0, i = 0;
        while(num!=0){
            int digit = num%10 ;
            if(digit == 6) ans+= Math.pow(10, i)*9;
            else ans+= Math.pow(10, i)*digit;
            i++;
            num /= 10;
        }
        return ans;
    }
}
