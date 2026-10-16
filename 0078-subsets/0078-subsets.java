class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        subSet(0, l1, l2, nums);
        return l1;
        
    }
    public static void subSet(int i, List<List<Integer>> l1, List<Integer> l2, int[] nums){
        if(i == nums.length){
            l1.add(new ArrayList<>(l2));
            return;
        }
        l2.add(nums[i]);
        subSet(i+1,l1,l2,nums);

        l2.remove(l2.size() - 1);
        subSet(i+1,l1,l2,nums);
        
    }
}