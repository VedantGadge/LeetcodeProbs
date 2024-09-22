public class q1450 {

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for(int i = 0;i<startTime.length;i++){
            if(Math.abs(queryTime-startTime[i])<=Math.abs(endTime[i]-startTime[i]) && startTime[i]<=queryTime) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        
    }
}
