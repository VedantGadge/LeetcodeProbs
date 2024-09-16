public class q414 {
    public static int thirdMax(int[] nums) {
        long a,b,c; // a = max , b = 2nd max , c = 3rd max
        a=b=c=Long.MIN_VALUE;
        
        for (int i:nums){
            if(i<=c || i==b || i==a){
                continue;
            }
            c=i;
            if(c>b){
                long temp = c;
                c=b;
                b=temp;
            }
            if(b>a){
                long temp = b;
                b=a;
                a=temp;
            }
        }

        return (int) (c==Long.MIN_VALUE? a:c);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,-2147483648};
        System.out.println(thirdMax(nums));
    }
}
