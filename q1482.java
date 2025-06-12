public class q1482 {

    static int maxEl(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i:arr){
            if(max<=i) max = i;
        }
        return max;
    }

    static int minEl(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i:arr){
            if(min>=i) min = i;
        }
        return min;
    }

    static int noOfBouquets(int[] arr, int days, int k){
        int adjFlowers = 0;
        int noOfBouquets = 0;
        for(int i:arr){
            if(days>=i) adjFlowers++;
            else{
               if(adjFlowers<k) adjFlowers = 0;
               else{
                noOfBouquets += adjFlowers/k;
                adjFlowers = 0;
               }

            }
        }
        noOfBouquets += adjFlowers / k;
        return noOfBouquets;
    }
    public static void main(String[] args) {
        int[] bloomDay = {7,7,7,7,13,11,12,7};
        int k = 3;
        int m = 2;
        int low = minEl(bloomDay) , high = maxEl(bloomDay);
        while(low<=high){
            int mid = low + (high - low)/2;
            if(noOfBouquets(bloomDay, mid, k) < m) low = mid + 1;
            else high = mid - 1;
        }
        System.out.println(low);
    }
}
