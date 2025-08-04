

public class q904 {
    public int totalFruit(int[] fruits) {
        int left = 0, maxTotal = 0, unique = 0;
        int[] count = new int[40001]; 
        for (int right = 0; right < fruits.length; right++) {
            if (count[fruits[right]] == 0) unique++;
            count[fruits[right]]++;
            while (unique > 2) {
                count[fruits[left]]--;
                if (count[fruits[left]] == 0) unique--;
                left++;
            }
            maxTotal = Math.max(maxTotal, right - left + 1);
        }
        return maxTotal;
    }
}
