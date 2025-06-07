class q152{
    public static void main(String[] args) {
        int nums[] = {-2,3,4,-1,0,-2,3,1,4,0,4,6,-1,4};
        int max = Integer.MIN_VALUE;
        int prefix=1 , suffix = 1; // we need suffix to manage odd no of neg. numbers , eg try [3,-1,4]
        for(int i = 0;i<nums.length;i++){
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;
            prefix *= nums[i];
            suffix *= nums[nums.length-i-1];
            max = Math.max(Math.max(prefix, suffix), max);
        }
        System.out.println(max);
    }
}





//Brute Force

// public class q152 {
//     public static void main(String[] args) {
//         int nums[] = {2,3,-2,4};
//         int max = Integer.MIN_VALUE;
//         int prod = 1;
//         for(int i = 0;i<nums.length;i++){
//             prod = 1;
//             for(int j = i;j<nums.length;j++){
//                 prod*=nums[j];
//                 if(max<=prod) max = prod;
//             }
//         }
//         System.out.println(max);
//     }
// }
