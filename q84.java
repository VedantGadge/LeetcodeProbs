public class q84 {
    public int largestRectangleArea(int[] heights) {
      int ans=0;
        int top=-1;
        int n=heights.length;
        int[] stack=new int[n+1];
        for(int i=0;i<=n;i++){
            int num=(i==n)?0:heights[i];
            while(top!=-1 && heights[stack[top]]>num){
                int j=stack[top--];
                int k=(top!=-1)?stack[top]:-1;
                ans=Math.max(ans,(heights[j]*(i-k-1)));
            }
            stack[++top]=i;
        }
        return ans;
    }
}
