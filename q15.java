// LeetCode 15: 3Sum - HashSet for duplicate avoidance with sorted array + two pointers technique
// Core Logic: Fix first element, use two pointers on remaining array, HashSet automatically handles duplicates
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class q15{


    public static void main(String[] args) {
        int[] arr = {-2,-2,-2,-1,-1,-1,0,0,0,2,2,2,2};
        HashSet<List<Integer>> ans = new HashSet<>();
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            if(i>0 && arr[i]!=arr[i]) continue;
            int j = i+1 , k = arr.length-1;
            while(j<k){

                int sum = arr[i]+arr[j]+arr[k];
                if(sum < 0){
                    j++;
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    ans.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;
                    while(j < k && arr[j]==arr[j-1]) j++;
                    while(j < k && arr[k]==arr[k+1]) k--;

                }

            }
        }

        System.out.println(ans);
    }
}