class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = (nums1.length+nums2.length);
        int arr[] = new int[total];
        for(int i=0;i<nums1.length;i++){
            arr[i] = nums1[i];
        }
        int j = nums1.length;
        for(int k=0;k<nums2.length;k++){
            arr[j] = nums2[k];
            j+=1;
        }
        Arrays.sort(arr);
        int fir =0, lst = arr.length-1,mid = (fir+lst)/2;
        double res;
        if(total%2!=0){
            res = arr[mid];
            return res ;
        }
        else{
            res = (arr[mid] + arr[mid+1])/2.0;
            return res;
        }
    }
}