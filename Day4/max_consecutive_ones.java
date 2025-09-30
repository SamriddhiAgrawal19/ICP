package Day4;

public class max_consecutive_ones {
    class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left =0 ;
        int zerocnt= 0 ;
        int maxlen = Integer.MIN_VALUE;
        for(int right= 0; right<n ; right++){
            if(nums[right] == 0){
                zerocnt ++;
            }
            while(zerocnt > k){
                if(nums[left] == 0){
                    zerocnt--;
                }
                left++;
            }
            maxlen = Math.max(maxlen, right-left +1);
        }
        return maxlen;
    }
}
}
