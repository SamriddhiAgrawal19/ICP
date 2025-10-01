package Day5;

public class lemonadeChange {
    class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int bills5 = 0;
        int bills10 = 0;
        if(bills[0]!=5){
            return false;
        }
        for(int i = 0 ; i < n ; i++){
            if(bills[i]==5){
                bills5++;
            }
            else if(bills[i] == 10){
                if(bills5 == 0){
                    return false;
                }
                bills5--;
                bills10++;
            }
            else{
               if(bills5>0 && bills10 >0){
                bills5--;
                bills10--;
               }
               else if(bills5>=3){
                bills5-=3;
               }
               else{
                return false;
               }


            }
        }
        return true;
    }
}
}
