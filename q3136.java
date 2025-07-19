// LeetCode 3136: Valid Word - ASCII range checking for alphanumeric validation with vowel/consonant requirements
// Core Logic: Check ASCII ranges for valid characters, ensure at least one vowel and one consonant
public class q3136 {
    public boolean isValid(String word) {
        if (word.length() < 3)
            return false;
        boolean vowel = false;
        boolean consonant = false;
        for (char ch : word.toCharArray()) {
            if ((ch > 47 && ch < 58) || (ch > 64 && ch < 91) || (ch > 96 && ch < 123)) {
                if (!(ch > 47 && ch < 58)) {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                        vowel = true;
                    else
                        consonant = true;
                }
            }
            else return false;
        }
        return vowel && consonant ;
    }
}
