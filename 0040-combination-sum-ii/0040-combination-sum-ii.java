class Solution {
    public List<List<Integer>> combinationSum2(int[] cand, int target) {
        List<List<Integer>> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        Arrays.sort(cand);
        solve(l1, l2, cand, target, 0);
        return l1;
    }
    
    public static void solve(List<List<Integer>> l1, List<Integer> l2, int[] cand, int target, int idx){
        if(target == 0){
            if(l1.contains(l2)) return;

            l1.add(new ArrayList<>(l2));
            return;
        }

        if(idx >= cand.length || target < 0) return;

        l2.add(cand[idx]);
        solve(l1, l2, cand, target - cand[idx], idx + 1);

        l2.remove(l2.size() - 1);

        while(((idx + 1) < cand.length) && (cand[idx] == cand[idx+1])) idx++;

        solve(l1, l2, cand, target, idx + 1);
    }
}