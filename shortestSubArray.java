/*
Description:
Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.

You need to find the shortest such subarray and output its length.

Result:
Runtime: 1 ms, faster than 100.00% of Java online submissions for Shortest Unsorted Continuous Subarray.
Memory Usage: 40.7 MB, less than 74.41% of Java online submissions for Shortest Unsorted Continuous Subarray.
*/
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if (nums.length < 2 ) { 
            return 0;
        }
        int left = 0;
        int right = 0;
        int i = 0;
        int j = 0;
        //Find left bound
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i+1]){
                left = i;
                break;
            }
        }
        
        //if the loop made it to the end, the array is sorted
        if (i == nums.length - 1) { 
            return 0;
        }
        
        //Find Right bound
        for (j = nums.length - 1; j > 0; j--) {
            if (nums[j] < nums[j - 1]) {
                right = j;
                break;
            }
        }
        //Find max and min values in nums
        int max = nums[left];
        int min = nums[left];
        for (i = left + 1; i <= j; i++) {
            if (nums[i] > max){
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        //Find left bound of the shortest subarray
        for (i = 0; i < left; i++) {
            if(nums[i] > min){
                left = i;
                break;
            }
        }
        //Find right bound of the shortest subarray
        for (i = nums.length - 1; i >= j + 1; i--) {
            if (nums[i] < max) {
                right = i;
                break;
            }
        }
        //return size of subarray
        return right - left + 1; 
    }
}
