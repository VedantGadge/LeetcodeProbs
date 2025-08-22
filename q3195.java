class q3195{
    public int minimumArea(int[][] grid) {
        int maxlen = 0 , maxheight = 0, minlen = Integer.MAX_VALUE , minheight = Integer.MAX_VALUE ;
        for(int i = 0;i<grid.length;i++){
            boolean present = false;
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    present = true;
                    maxlen = Math.max(maxlen, j);
                    minlen = Math.min(minlen, i);
                }
            }
            if(present){
                maxheight = Math.max(maxheight, i);
                minheight = Math.min(minheight, i);
            } 
        }
         return (maxlen-minlen+1)*(maxheight-minheight+1);
    }

}