public class q1317 {

    public boolean checkNonZero(int n){
        while(n>0){
            int digit = n % 10;
            if(digit==0) return false;
            n /= 10;
        }
        return true;
    }

    public int[] getNoZeroIntegers(int n) {
        for(int i = 1 ; i<= n;i++){
            if(checkNonZero(i) && checkNonZero(n-i)){
                return new int[] {i,n-i};
            } 
        }
        return new int[] {-1,-1};
    }
}
