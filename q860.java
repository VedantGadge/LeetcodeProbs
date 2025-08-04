class q860{
    public boolean lemonadeChange(int[] bills) {
        int count5 = 0 , count10 = 0 ;
        for(int bill: bills){
            if(bill == 5) count5++;
            else if(bill == 10){
                count10++;
                if(count5>0) count5--;
                else return false;
            }
            else{
                if(count10>0 && count5>0){
                    count10--;
                    count5 --;
                }
                else if(count5>=3){
                    count5 -= 3;
                }
                else return false;
            }
        }
        return true;
    }
}