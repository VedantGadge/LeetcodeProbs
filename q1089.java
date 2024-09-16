public class q1089 {
    public static void duplicateZeros(int[] arr) {
        for(int i =0;i<arr.length-1;i++ ){
            if(arr[i]==0){
                for(int j = arr.length-2;j>=i;j--){
                    arr[j+1] = arr[j];
                }
                i++;
            }
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
    }
}
