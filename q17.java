import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class q17 {

    static void combinations(String digits, int index, StringBuilder current, Map<Character, String> buttons, List<String> result) {
        if (index == digits.length()) {
            if (current.length() > 0) result.add(current.toString());
            return;
        }
        String letters = buttons.get(digits.charAt(index));
        for (char c : letters.toCharArray()) {
            current.append(c);
            combinations(digits, index + 1, current, buttons, result);
            current.deleteCharAt(current.length() - 1);
        }
    }

    static List<String> letterCombinations(String digits) {
        Map<Character, String> buttons = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
        );
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;
        combinations(digits, 0, new StringBuilder(), buttons, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
