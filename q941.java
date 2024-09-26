public class q941 {
    public static boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        int maxIndex = 0;
        for (int i = 0;i<arr.length;i++){
            if(arr[i]>arr[maxIndex]) maxIndex = i;
        } 
        System.out.println(maxIndex);
        if(maxIndex == 0 || maxIndex ==arr.length-1) return false;
        boolean mountain = false;
        for(int i = 0;i<maxIndex;i++){
            mountain = (arr[i]<arr[i+1])? true:false;
        }
        for(int i = arr.length-1;i>maxIndex;i--){
            mountain = (arr[i]<arr[i-1])? true:false;
        }
        return mountain;
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2};
        System.out.println(validMountainArray(arr));
    }
}

