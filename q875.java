public class q875 {

    static int maxElement(int[] arr){
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    static int calcTotHrs(int[] arr, int perhr){
        int totalHr = 0;
        for(int bananas: arr){
            totalHr += Math.ceil((double)bananas/(double)perhr);
        }
        return totalHr;
    }
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 6;
        int low = 1 ,high = maxElement(piles);
        while(low<=high){
            int mid = low + (high - low)/2;
            if(calcTotHrs(piles, mid) <= h){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println(low);
    }
}
