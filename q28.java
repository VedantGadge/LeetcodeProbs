class q28{
    public int strStr(String haystack, String needle) {
        int ptr = 0;
        for(int i = 0 ; i<haystack.length();i++){          
            if(haystack.charAt(i)==needle.charAt(ptr)){
                ptr++;
            }
            else{
                i -= ptr;
                ptr = 0;
            }
            if(ptr == needle.length()) return i-ptr+1;  
        }
        return -1;
    }
}