// LeetCode 2798: Number of Employees Who Met the Target - Simple counter with threshold comparison
// Core Logic: Iterate through hours array, count employees with hours >= target
public class q2798{

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int i = 0;i<hours.length;i++){
            if(hours[i]>=target) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        
    }
}