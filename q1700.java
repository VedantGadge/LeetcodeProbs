public class q1700 {
    
    public int countStudents(int[] students, int[] sandwiches) {
        int cSandwhich = 0 , sSandwhich = 0;
        for(int choice: students){
            if(choice == 0) cSandwhich++;
            else sSandwhich++;
        }
        for(int sandwich : sandwiches){
            if(sandwich == 1 && sSandwhich ==0) return cSandwhich;
            if(sandwich == 0 && cSandwhich ==0) return sSandwhich;
            if(sandwich==0) cSandwhich--;
            else sSandwhich--;
        }
        return 0;
    }
}
