class q3461{
    public boolean hasSameDigits(String s) {
         int n = s.length();
        // convert to int array
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.charAt(i) - '0';
        }
        // reduce until size is 3(2)
        int size = n;
        while (size > 2) {
            for (int i = 0; i < size - 1; i++) {
                a[i] = (a[i] + a[i + 1]) % 10;
            }
            size--;
        }
        return a[0] == a[1];
    }
}