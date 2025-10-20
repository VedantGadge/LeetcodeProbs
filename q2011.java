class q2011{
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for(String s : operations){
            ans+=  operationCheck(s);
        }
        return ans;
    }

    public int operationCheck(String s){
        for(char ch: s.toCharArray()){
            if(ch == '+'){
                return 1;
            }
        }
        return -1;
    }
}