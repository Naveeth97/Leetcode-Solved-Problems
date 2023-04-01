class Solution {
    public int search(int[] nums, int target) {
        int fir =0,lst = nums.length-1;
        while(fir<=lst){
            int mid = (fir+lst)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target>nums[mid]){
                fir = mid+1;
            }
            else{
                lst = mid-1;
            }
        }
        return -1;
        
    }
}