/*
Time Complexity: O(N)
Space Complexity: O(1)
*/
class Solution {
    public int singleNumber(int[] nums) {
        int num=nums[0];
        for(int i=1;i<nums.length;i++){
          num=nums[i]^num;
        }
        return num;
    }
}