class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i])) {
                hm.put(nums[i], true);
            } else {
                return true;
            }
        }

        return false;
    }
}