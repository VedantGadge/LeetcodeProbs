public class q66 {
    
    public static int[] plusOne(int[] digits) {
        
        for(int i = digits.length-1;i>=0;i--){ //checks from the back, if encounters 9 , puts a 0 in that place
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i]=0; 
            }
        }

        // for the 9, 99, 999 , 9999 cases
        if(digits[0]==0){
            int[] res = new int[digits.length+1];
            res[0]=1;
            return res;
        }
        return digits;
    }
    public static void main(String[] args) {
        int[] digits = {9,9,9,9};
        int[] res = plusOne(digits);
        for(int i = 0;i<res.length;i++){
            System.out.print(res[i]);
        }
    }
}
