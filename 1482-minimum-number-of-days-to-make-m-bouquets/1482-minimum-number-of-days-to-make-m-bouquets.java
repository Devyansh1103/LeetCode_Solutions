class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long day = (long) m * k;
        if(n < day) return -1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i : bloomDay){
            low = Math.min(low,i);
            high = Math.max(high,i);
        }

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(possible(bloomDay, m, k, mid)) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
    public boolean possible(int[] bloomDay, int m, int k, int day){
        int bouquet = 0;
        int flower = 0;
        for(int i : bloomDay){
            if(i <= day){
                flower++;
                if(flower == k){
                    bouquet++;
                    flower = 0;
                }
            }
            else{
                flower = 0;
            }
        }
        return (bouquet >= m);
    }
}