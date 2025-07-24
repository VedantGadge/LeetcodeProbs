public class q2379 {
    public int minimumRecolors(String blocks, int k) {
        int minOpr = Integer.MAX_VALUE;
        int noOfW = 0;
        int left = 0;
        char[] str = blocks.toCharArray();
        for(int right = 0;right<str.length;right++){
            if(str[right]=='W'){
                noOfW++;
            }
            if(right - left + 1 == k){
                minOpr = Math.min(minOpr, noOfW);
                if(str[left]=='W') noOfW--;
                left++;
            } 
            
        }
        return minOpr;
    }
}
