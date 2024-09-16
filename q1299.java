public class q1299{
    public static int[] replaceElements(int[] arr) {
        int max = -1;
        for(int i = arr.length-1;i>=0;i--){
            int current = arr[i];
            arr[i] = max;
            if(current>max) max = current;
        }
        System.gc();
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        int[] res = replaceElements(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}