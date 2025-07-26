
public class q1813 {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if (sentence1.isEmpty() || sentence2.isEmpty()) return true;
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        int n1 = s1.length, n2 = s2.length;
        int prefix = 0;
        while (prefix < n1 && prefix < n2 && s1[prefix].equals(s2[prefix])) {
            prefix++;
        }
        int suffix = 0;
        while (suffix < n1 - prefix && suffix < n2 - prefix &&
                s1[n1 - 1 - suffix].equals(s2[n2 - 1 - suffix])) {
            suffix++;
        }
        return prefix + suffix >= Math.min(n1, n2);
    }
}
