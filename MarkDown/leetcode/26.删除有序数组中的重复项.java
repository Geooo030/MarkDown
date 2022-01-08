/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int slow = 0;
        for(int quick = 1; quick < nums.length; quick++) {
            if(nums[slow] != nums[quick]) {
                nums[++slow] = nums[quick];
            }
        }
        return slow + 1;
        
    }
}
// @lc code=end

