class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        solve(l1, l2, arr, n, 0, k, 0);
        return l1;
    }

    public static void solve(List<List<Integer>> l1, List<Integer> l2, int[] arr, int n, int idx, int k, int count){
        if((count == k) && (n == 0)){
            l1.add(new ArrayList<>(l2));
            return;
        }

        if(count > k || n < 0 || idx >= arr.length) return;

        l2.add(arr[idx]);
        solve(l1, l2, arr, n - arr[idx], idx + 1, k, count + 1);

        l2.remove(l2.size() - 1);
        solve(l1, l2, arr, n, idx + 1, k, count);
    }
}