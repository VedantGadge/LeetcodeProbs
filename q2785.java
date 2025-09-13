import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q2785 {

    boolean isVowel(char ch){
        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public String sortVowels(String s) {
        char[] arr = s.toCharArray();
        List<Character> vowels = new ArrayList<>();
        for(char ch:arr){
            if(isVowel(ch)) vowels.add(ch);
        }
        Collections.sort(vowels);
        int temp = 0;
        for(int i = 0;i<arr.length;i++){
            if(isVowel(arr[i])){
                arr[i] = vowels.get(temp);
                temp++;
            } 
        }
        return new String(arr);
    }
}
