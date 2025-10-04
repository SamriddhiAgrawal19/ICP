package Day5;

import java.util.Arrays;

public class boats_to_save {
    class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        Arrays.sort(arr);
        int n = arr.length;
        int sum =0 ;
        for(int ele : arr){
            sum+=ele;
        }
        if(sum <=limit){
            return 1;
        }
        int i = 0;
        int j = n-1;
        int cnt = 0;
        while(i<=j){
            if(arr[i] + arr[j] <= limit){
                cnt++;
                i++;
                j--;

            }
            else{
                j--;
                cnt++;
            }
        }
        return cnt;

        
        
        
    }
}
}
