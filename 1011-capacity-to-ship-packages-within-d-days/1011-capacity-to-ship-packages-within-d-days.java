class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for(int i : weights){
            low = Math.max(i,low);
            high += i; 
        }

        while(low < high){
            int mid = low + (high - low) / 2;
            int sum = 0;
            int D = 1;
            
            for(int j : weights){
                if((sum + j) > mid){
                    D++;
                    sum = 0;
                }
                sum += j;
            }

            if(D > days) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}