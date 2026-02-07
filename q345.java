class q345{
    public String reverseVowels(String s) {
        int i = 0 , j = s.length()-1;
        StringBuilder str = new StringBuilder(s);
        while(i<j){
            while(i < j && !isVowel(str.charAt(i))) i++;
            while(i < j && !isVowel(str.charAt(j))) j--;
                char temp = str.charAt(i);
                str.setCharAt(i,str.charAt(j));
                str.setCharAt(j,temp);
                i++;
                j--;
            }
            return str.toString();
        }
       
    public boolean isVowel(char ch){
        return (Character.toLowerCase(ch) == 'a' )  || (Character.toLowerCase(ch) == 'e' ) ||  (Character.toLowerCase(ch) == 'i' ) || (Character.toLowerCase(ch) == 'o') || ( Character.toLowerCase(ch) == 'u' ) ;
    } 
}