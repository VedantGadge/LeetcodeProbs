// LeetCode 169: Majority Element - Boyer-Moore Majority Voting Algorithm with count tracking
// Core Logic: Increment count for candidate match, decrement for mismatch; majority survives cancellation
class q169{
    public static void main(String[] args) {
        int nums[] = {3,3,4,4,2,1,3};
        int count = 0, majority=0;
        for (int num:nums){
            if(count==0){
                majority = num;
            } 
            count += (num==majority)? 1 : -1;
        }
        System.out.println(majority);
    }
}

//uses Bayer-Moore Majority Voting Algorithm
//needs to have a majority candidate (appears more than n/2 times) 