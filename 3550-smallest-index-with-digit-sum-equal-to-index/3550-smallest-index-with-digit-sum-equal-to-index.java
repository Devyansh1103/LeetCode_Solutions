class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;

        if(n == 0) return -1;

        for(int i = 0; i < n; i++){
            int sum = 0;
            int m = nums[i];
            while(m > 0){
                int reb = m % 10;
                sum += reb;
                m /= 10;
            }
            if(sum == i) return i;

        }
        return -1;
    }
}