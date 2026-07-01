class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int index = 0;
        int other = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                other = map.get(target - nums[i]);
                break;
            }

            map.put(nums[i], i);
            index++;
        }

        return new int[] {other, index};
    }
}
