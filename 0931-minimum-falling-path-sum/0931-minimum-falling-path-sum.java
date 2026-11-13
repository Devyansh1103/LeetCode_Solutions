class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] arr = new int[m][n];

        for(int j = 0; j < n; j++){
            arr[0][j] = matrix[0][j];
        }

        for(int i = 1; i < m; i++){
            for(int j = 0; j < n; j++){
                if(j == 0) arr[i][j] = Math.min(arr[i-1][j], arr[i-1][j+1]) + matrix[i][j];

                else if(j == n-1) arr[i][j] = Math.min(arr[i-1][j], arr[i-1][j-1]) + matrix[i][j];

                else arr[i][j] = Math.min(arr[i-1][j-1], Math.min(arr[i-1][j], arr[i-1][j+1])) + matrix[i][j];
            }
        }
        int min = Integer.MAX_VALUE;
        for(int j = 0; j < n; j++){
            min = Math.min(min, arr[m-1][j]);
        }
        return min;
    }
}