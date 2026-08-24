import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generate(nums, 0, result);
        return result;
    }

    void generate(int[] nums, int index, List<List<Integer>> result) {
        if (index == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int n : nums) temp.add(n);
            result.add(temp);
            return;
        }

        HashSet<Integer> isUsed = new HashSet<>();
        for (int i = index; i < nums.length; i++) {
            if (isUsed.contains(nums[i])) continue;

            isUsed.add(nums[i]);
            swap(nums, index, i);
            generate(nums, index + 1, result);
            swap(nums, index, i);
        }
    }

    void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
