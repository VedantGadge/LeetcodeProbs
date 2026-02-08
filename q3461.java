class q3461{
    public boolean hasSameDigits(String s) {
         int n = s.length();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.charAt(i) - '0';
        }
        for (int size = n; size > 2; size--) {
            for (int i = 0; i < size - 1; i++) {
                a[i] = (a[i] + a[i + 1]) % 10;
            }
        }
        return a[0] == a[1];
    }
}