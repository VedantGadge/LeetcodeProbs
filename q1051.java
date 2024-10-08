public class q1051 {
    public int heightChecker(int[] heights) {
        // perform a bucket-sort
        int[] bucket = new int[101];
        for(int number : heights) {
            bucket[number]++;
        }
        
        // check the amount of disparities between the input array and the bucket
        int count = 0, index = 0;
        for(int i = 1; i <= 100; i++) {
            while(bucket[i] > 0) {
                if(i != heights[index++]) count++;
                bucket[i]--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
