class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        
        if(n <= 2) return 0;

        int[] arr = new int[n];
        int ans = 0;

        for(int i = 2; i < n; i++){
            if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2]){
                arr[i] = arr[i-1] + 1;
                ans += arr[i];
            }
        }
        return ans;
    }
}