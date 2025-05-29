public class q283 {

    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        int i = 0;

        for (int num : arr){
            if(num != 0){
                arr[i++] = num;
            }
        }

        while(i<arr.length){
            arr[i] = 0;
        }
        for(int j =0;j<arr.length;j++){
              System.out.print(arr[j]);
         }
    }
}
