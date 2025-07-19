// LeetCode 1550: Three Consecutive Odds - Simple iteration with modulo check for three consecutive positions
// Core Logic: Check arr[i], arr[i+1], arr[i+2] all odd using modulo 2 == 1 condition
public class q1550 {
    public static boolean threeConsecutiveOdds(int[] arr) {
        for(int i =0;i<arr.length-2;i++){
            if(arr[i]%2==1 && arr[i+1]%2==1 && arr[i+2]%2==1){
                System.gc();
                return true;
        }
    }
    System.gc();
    return false;
}
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        System.out.println(threeConsecutiveOdds(arr));
    }
}
