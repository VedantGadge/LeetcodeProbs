class q1423{
    public int maxScore(int[] cardPoints, int k) {
       int total = 0;
       for(int i = 0;i<k;i++) total+= cardPoints[i];
       int max = total;
       for(int i = k - 1 , j = cardPoints.length -1 ; i>=0;i--,j--){
        total = total - cardPoints[i] + cardPoints[j]; //remove the ith number and add the jth number , sliding window is basically shifting left , wrapping to the right end of the array as it shifts leftwards.
        max = Math.max(max, total);
        }
        return max;
    }
}