//Incomplete

public class q2210 {
    public int countHillValley(int[] nums) {
        int HnV = 0; //variable to track the count of hills n valleys
        boolean HorV = true;
        for(int i = 1;i<nums.length-1;i++){
            if(nums[i]!= nums[i-1] && nums[i]!= nums[i+1] && HorV == false){
                if((nums[i-1] >nums[i] && nums[i+1] >nums[i]) || (nums[i-1] <nums[i] && nums[i+1] <nums[i])){
                    HnV++;
                    HorV = true;
                }
                else HorV = true; 
            }
            else {
                continue;
            }
        }

    }

    public static void main(String[] args) {
        
    }
}
