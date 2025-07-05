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
