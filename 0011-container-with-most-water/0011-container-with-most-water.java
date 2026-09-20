class Solution {
    public int maxArea(int[] h) {
        int max = Integer.MIN_VALUE;
        int n = h.length;
        int i = 0, j = n-1;
        while(i < j){
            int height = Math.min(h[i], h[j]);
            int weight = j - i;
            int a = height * weight;
            max = Math.max(a,max);
            if(h[i] < h[j]) i++;
            else j--;
        }
        return max;
    }
}