class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        
        solve(arr, l1, l2, target, 0);
        return l1;
    }
    public static void solve(int[] arr, List<List<Integer>> l1, List<Integer> l2, int target, int idx){
        if(target == 0){
            l1.add(new ArrayList<>(l2));
            return;
        }
        if(idx >= arr.length || target < 0) return;

        l2.add(arr[idx]);
        solve(arr, l1, l2, (target - arr[idx]), idx);

        l2.remove(l2.size() - 1);
        solve(arr, l1, l2, target, idx + 1);
    }
}