public class q1779 {

    public static int nearestValidPoint(int x, int y, int[][] points) {
       int dist = 100000;
       int index = -1;
       for( int i = 0;i<points.length;i++){
        int temp = 0;
        if(points[i][0] == x || points[i][1] == y){
            temp = Math.abs(x-points[i][0]) + Math.abs(y-points[i][1]);
            if (temp<dist){
                dist = temp;
                index=i;
            } 
        } 
       } 
       return index;
    }

    public static void main(String[] args) {
        int[][] points = {{1,2},{3,1},{2,4},{2,3},{4,4}};
        System.out.println(nearestValidPoint(3, 4, points));
    }
}
