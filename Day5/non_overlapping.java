package Day5;

import java.util.Arrays;

public class non_overlapping {
    class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr , (a,b)->Integer.compare(a[1] , b[1]));
        int cnt = 0;
        int end = arr[0][1];
        for(int i = 1 ; i < n ; i++){
            //System.out.println(end);
            if(arr[i][0] < end){
                cnt++;
            }
            else{
                end = arr[i][1];
            }
            
        }
        return cnt;
    }
}
}
