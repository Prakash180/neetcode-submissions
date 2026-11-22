class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(IntStream.of(nums).boxed().collect(Collectors.toSet()));
        return nums.length != set.size();
    }
}