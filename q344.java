public class q344 {
    
    public void reverseString(char[] s) {
        if(s.length<2) return;
        int i = 0;
        int j = s.length - 1;
        while(i<j){
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
            i++;  j--;
        }
    }
    
    public static void main(String[] args) {
        
    }
}
