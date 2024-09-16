public class q189 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k =3;

        for(int z =1;z<=k;z++){
        int lastElement = arr[arr.length - 1];

        // Shift all elements to the right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
            
        }
        // Set the first element to the previous last element
        arr[0] = lastElement;
    }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
}
}

/*
 i=6   1234566
 i=5   1234556
 i=4   1234456
 i=3   1233456
 i=2   1223456
 i=1   1123456
 */