public class q769 {
     public int maxChunksToSorted(int[] arr) {
        int chunks = 0 , currSum = 0 , expectedSum = 0;
        for(int i = 0;i<arr.length;i++){
            currSum+= arr[i];
            expectedSum+= i;
            if(currSum==expectedSum) chunks++;
        }
        return chunks;
    }
}
