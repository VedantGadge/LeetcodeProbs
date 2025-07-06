public class q167 {
    static int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        int[] index = new int[2];
        while (low <= high) {
            int currSum = numbers[low] + numbers[high];
            if(currSum>target) high--;
            else if(currSum<target) low++;
            else{
                return new int[]{low + 1, high + 1};
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[] {2,7,5,11} , 9));
    }
}
