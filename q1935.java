import java.util.HashSet;

public class q1935 {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0 ; i<brokenLetters.length();i++){
            set.add(brokenLetters.charAt(i));
        }
        int words = 0;
        String[] word = text.split(" ");
        for (String w : word) {
            boolean validWord = true;
            for (int i = 0; i < w.length(); i++) {
                if (set.contains(w.charAt(i))) {
                    validWord = false;
                    break;
                }
            }
            if (validWord) words++;
        }
        return words;
    }
}
