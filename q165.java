public class q165 {
    public int compareVersion(String version1, String version2) {
        int v1 = 0;
        int v2 = 0;
        char[] arr1 = version1.toCharArray();
        char[] arr2 = version2.toCharArray();
        while(arr1[v1]!='.') {
            v1++;
        }
        while(arr2[v2]!='.') {
            v2++;
        }
        v1++;
        v2++;
        int val1 = Integer.parseInt(version1.substring(v1));
        int val2 = Integer.parseInt(version2.substring(v2));
        return val1 > val2 ? 1 : val1 < val2 ? -1 : 0;
    }
}
