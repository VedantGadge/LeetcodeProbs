import java.util.HashMap;

class q3541{
    public boolean isVowel(char ch){
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public int maxFreqSum(String s) {
        HashMap<Character,Integer> table = new HashMap<>();
        int vowelFreq = 0 , consonantFreq = 0;
        for(int i = 0;i<s.length();i++){
            table.put(s.charAt(i),table.getOrDefault(s.charAt(i),0)+1);
        }
        for(char ch : table.keySet()){
            if(isVowel(ch)) vowelFreq = Math.max(vowelFreq, table.get(ch));
            else consonantFreq = Math.max(consonantFreq, table.get(ch));
        }
        return vowelFreq + consonantFreq;
    }
}