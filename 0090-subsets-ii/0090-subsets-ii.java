class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        Arrays.sort(nums);

        subSet(0, l1, l2, nums);
        return l1;
    }
    public void subSet(int i, List<List<Integer>> l1, List<Integer> l2, int[] arr){
        if(l1.contains(l2)) return;

        if(i == arr.length){
            l1.add(new ArrayList<>(l2));
            return;
        }
        l2.add(arr[i]);
        subSet(i+1, l1, l2, arr);

        l2.remove(l2.size()-1);
        subSet(i+1, l1, l2, arr);
    }
}