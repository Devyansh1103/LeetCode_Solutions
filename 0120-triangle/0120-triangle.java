class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] arr = new int[n][n];

        arr[0][0] = triangle.get(0).get(0);

        for(int i = 1; i < n; i++){
            for(int j = 0; j <= i; j++){
                if(j == 0) arr[i][0] = arr[i-1][0] + triangle.get(i).get(j);

                else if(j == i) arr[i][j] = arr[i-1][j-1] + triangle.get(i).get(j);

                else arr[i][j] = Math.min(arr[i-1][j], arr[i-1][j-1]) + triangle.get(i).get(j);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            min = Math.min(min, arr[n-1][i]);
        }
        return min;
    }
}