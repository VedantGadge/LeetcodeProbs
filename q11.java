// LeetCode 11: Container With Most Water - Two pointers to find maximum water container area
// Core Logic: Start with widest container, move pointer with smaller height inward to maximize area
public class q11 {
    public int maxArea(int[] height) {
       int right = height.length-1;
       int left = 0;
       int area = Integer.MIN_VALUE;
       while(left<=right){
            int currArea = Math.min(height[left], height[right]) * (right - left);
            area = Math.max(area, currArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            } 
       }
        return area;
    }
}
