public class q3079 {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int x : nums){
            int n = 0;
            int maxDigit = 0;
            while(x!=0){
                int digit = x%10;
                if(digit>maxDigit) maxDigit = digit;
                x /= 10;
                n++;
            }
            if(n==1){
                sum+=maxDigit;
            }
            else if(n==2){
                sum+= 11*maxDigit;
            }
            else if(n==3){
                sum+= 111*maxDigit;
            }
            else {
                sum+=1111*maxDigit;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        
    }
}
