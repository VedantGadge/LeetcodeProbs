public class q2109 {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder();
        int  i = 0 , j = 0;
            while(i<s.length()){
                if(i+1==spaces[j]){
                    ans.append(" ");
                    j++;
                }
                ans.append(s.charAt(i));
                i++;
            }
            return ans.toString();
        }
    
}
