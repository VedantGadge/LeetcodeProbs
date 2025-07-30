
public class q3223 {
    public int minimumLength(String s) {
        int arr[]= new int[26];


        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);

            arr[ch-97]++;
        }

        int count=0;
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
            count+=(arr[i]%2==0) ? 2 :1;
            }
        }
        return count;
    }
}
