import java.util.Arrays;

public class q1313 {
    public int[] decompressRLElist(int[] nums) {
       int arrSize = 0;
       for(int i = 0;i<nums.length;i+=2){
        arrSize += nums[i];
       }

       int[] res = new int[arrSize];
       int startIndx = 0;
       for(int i = 0;i<nums.length;i+=2){
        Arrays.fill(res, startIndx, startIndx + nums[i],nums[i+1]); 
        // Arrays,fill( Object {here it was res, which is a list object} , start index {from where do it needs to start filling} , end index {to where do it needs to start filling} , value {what does it has to fill , heer an int} )
        startIndx +=nums[i];
       }
       return res;
    }
    public static void main(String[] args) {
        
    }
}
