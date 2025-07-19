// LeetCode 2149: Rearrange Array Elements by Sign - Two-pointer approach with separate indices for positive/negative
// Core Logic: Use pos=0, neg=1 indices, increment by 2, place elements based on sign
public class q2149 {
    public static void main(String[] args) {
        int nums[] = {3,1,-2,-5,2,-4};
        int ans[] = new int[nums.length];
        int pos = 0 , neg = 1;
        for (int num:nums){
            if(num>0){
                ans[pos] = num;
                pos+=2;
            }
            else{
                ans[neg] = num;
                neg+=2;
            }
        }
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
