import java.util.HashSet;
import java.util.Set;

public class q1079 {
    public int numTilePossibilities(String tiles) {
        Set<String> res = new HashSet<>();
        boolean[] used = new boolean[tiles.length()];
        possibilities(tiles, res, new StringBuilder(), used);
        return res.size();
    }

    public void possibilities(String tiles, Set<String> res, StringBuilder curr, boolean[] used) {
        if (curr.length() > 0) {
            res.add(curr.toString());
        }
        for (int i = 0; i < tiles.length(); i++) {
            if (used[i]) continue;
            if (i > 0 && tiles.charAt(i) == tiles.charAt(i - 1) && !used[i - 1]) continue;
            used[i] = true;
            curr.append(tiles.charAt(i));
            possibilities(tiles, res, curr, used);
            curr.deleteCharAt(curr.length() - 1);
            used[i] = false;
        }
    }
}
