class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        int prev1 = nums[0];
        int prev2 = 0;
        for(int i = 1; i < n; i++){
            int pick = prev2 + nums[i];
            int notpick = prev1;

            prev2 = prev1;
            prev1 = Math.max(pick, notpick);
        }
        return prev1;
    }
}