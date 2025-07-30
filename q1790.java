class q1790{
    public boolean areAlmostEqual(String s1, String s2) {
        int count = 0 , p1 = -1 , p2 = -1;
        for(int i = 0 ;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
                if(p1>=0) p2 = i;
                else p1 = i;
            } 
        }
        if(count==2){
            if(s1.charAt(p1)==s2.charAt(p2) && s1.charAt(p2)==s2.charAt(p1)) return true;
        }
        return false;
    }
}