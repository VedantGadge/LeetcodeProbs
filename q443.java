public class q443 {
    public int compress(char[] chars) {
        int idx = 0;
        for(int i = 0 ;i<chars.length;i++){
            char currChar = chars[i];
            int count = 0;
            while(i < chars.length && chars[i] == currChar){
                count++;
                i++;
            }
            i--; // adjust for the extra increment in the loop
            if(count==1) chars[idx++] = currChar;
            else {
                chars[idx++] = currChar;
                String freq = String.valueOf(count);
                for(char digit: freq.toCharArray()){
                    chars[idx++] = digit;
                }
            }
        }
        return idx;
    }
}
