public class q1287 {

    public static int findSpecialInteger(int[] arr) {
        int size = arr.length/4;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==arr[i+size]){
                System.gc();
                return arr[i];
            }
        }
        System.gc();
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,10};
        System.out.println(findSpecialInteger(arr));
    }
}
