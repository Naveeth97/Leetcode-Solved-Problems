class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int m = nums.length-1;
        int max = 0;
        while(i<k){
            max = nums[m];
            m--;
            i++;
        }
        return max;
    }
}