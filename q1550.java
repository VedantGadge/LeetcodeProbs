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
