package Day1;

import java.util.Arrays;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[]arr = new int[2];
        Arrays.fill(arr , -1);
        arr[0] = lb(nums , target);
        arr[1] = up(nums, target);
        return arr;
    }
    public int lb(int[]nums, int target){
        int l = 0; 
        int r = nums.length-1;
        int ans = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                ans = mid;
                r = mid -1;


            }
            else if(nums[mid] > target){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return ans;
    }
    public int up(int[]nums, int target){
        int l = 0; 
        int r = nums.length-1;
        int ans = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                ans = mid;
                l = mid + 1;


            }
            else if(nums[mid] > target){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return ans;
    }
}