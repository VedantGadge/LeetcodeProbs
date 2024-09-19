public class q3190 {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int x:nums){
            if(x%3!=0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        
    }
}
