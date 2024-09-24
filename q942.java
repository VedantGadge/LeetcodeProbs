public class q942 {
    public int[] diStringMatch(String s) {
        int n = s.length();
         int[] perm = new int[n + 1];
         int low = 0, high = n;
 
         for (int i = 0; i < n; i++) {
             if (s.charAt(i) == 'I') {
                 perm[i] = low++;
             } else {
                 perm[i] = high--;
             }
         }
         // The last element in the perm array will be the remaining number
         perm[n] = low;  // low and high are equal at this point
 
         return perm; 
     }
     public static void main(String[] args) {
        
     }
}
